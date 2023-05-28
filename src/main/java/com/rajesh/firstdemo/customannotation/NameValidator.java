package com.rajesh.firstdemo.customannotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class NameValidator implements ConstraintValidator<NameValidatoion,String> {

    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        return name.length()>3;
    }
}
