package com.doctor.Medical_Clinic.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class TelephoneImple implements ConstraintValidator<Telephone,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if(s.isBlank()||s.isEmpty()||s==null) {
            return false;
        }
            Pattern pattern = Pattern.compile("[0-9]{11}");

            return pattern.matcher(s).find();
        }

}
