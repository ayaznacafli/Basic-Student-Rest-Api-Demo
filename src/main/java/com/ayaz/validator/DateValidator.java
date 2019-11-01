package com.ayaz.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements ConstraintValidator<ValidDate,String> {
    private Pattern pattern;
    private Matcher matcher;
    private static final String DATE_PATTERN = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
    @Override
    public void initialize(ValidDate constraintAnnotation) {
        // TODO Auto-generated method stub
    }
    @Override
    public boolean isValid(String date, ConstraintValidatorContext context) {
        // TODO Auto-generated method stub
        pattern = Pattern.compile(DATE_PATTERN);
        matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
