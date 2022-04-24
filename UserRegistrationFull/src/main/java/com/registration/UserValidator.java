package com.registration;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String NAME_PATTERN = "^([A-Z])([a-z]{2})([a-z]*)$";
    private static final String EMAIL_PATTERN = "^([a-z0-9]+)([.+_-]?[a-z0-9]+)?@([a-z0-9]+)(.[a-z]{2,4})?(.[a-z]{2,4})$";
    private static final String PHONE_NO_PATTERN = "^91 [0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$).{8}$";

    public boolean validateName(String name) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(name).matches();
    }

    public boolean validateEmailAddress(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validatePhoneNo(String number) {
        Pattern pattern = Pattern.compile(PHONE_NO_PATTERN);
        return pattern.matcher(number).matches();
    }

    public boolean validatePassword(String passWord) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(passWord).matches();
    }
}
