package com.rajesh.firstdemo.model;

import com.rajesh.firstdemo.customannotation.NameValidatoion;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Employee {

    @NotEmpty(message = "Name not be empty.")
    @NameValidatoion(message = "Name must be 3 or more charactors.")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Integer id;
    @NotNull
    private Double marks;

}
