package com.rajesh.firstdemo.model;

import com.rajesh.firstdemo.customannotation.NameValidatoion;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Integer id;

    @NotEmpty(message = "Name not be empty.")
    @NameValidatoion(message = "Name must be 3 or more charactors.")
    private String name;

    @NotNull
    private Double marks;

}
