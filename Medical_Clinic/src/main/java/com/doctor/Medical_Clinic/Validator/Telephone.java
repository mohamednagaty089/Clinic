package com.doctor.Medical_Clinic.Validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy ={TelephoneImple.class} )
public @interface Telephone {
    String message() default "{validation.constraints.Telephone.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
