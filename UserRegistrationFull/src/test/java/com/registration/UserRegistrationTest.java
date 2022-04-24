package com.registration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
    UserValidator userValidator = new UserValidator();

    @Test
    public void givenName_WhenValid_ReturnTrue() {
        boolean result = userValidator.validateName("Kalimuthu");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void givenName_WhenShort_ReturnFalse() {
        boolean result = userValidator.validateName("Ka");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void givenEmail_WhenValid_ReturnTrue() {
        boolean result = userValidator.validateEmailAddress("kalir888@gmail.com");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void givenEmail_WhenNotValid_ReturnFalse() {
        boolean result = userValidator.validateEmailAddress("kalir888@@gmail.com");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void givenPhoneNo_WhenValid_ReturnTrue() {
        boolean result = userValidator.validatePhoneNo("91 9790295762");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void givenPhoneNO_WhenNoCountryCode_ReturnFalse() {
        boolean result = userValidator.validatePhoneNo("9790295762");
        Assertions.assertEquals(false,result);
    }

    @Test
    public void givenPassWord_WhenValid_ReturnTrue() {
        boolean result = userValidator.validatePassword("K@lir888");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void givenPassWord_WhenHaveMoreCharacters_ReturnFalse() {
        boolean result = userValidator.validatePassword("K@lir8888");
        Assertions.assertEquals(false,result);
    }

    public void passedEmail_WhenValid_ReturnTrue(String email) {
        boolean result = userValidator.validateEmailAddress(email);
        Assertions.assertEquals(true,result);
    }

    public void passedEmail_WhenNotValid_ReturnFalse(String email) {
        boolean result = userValidator.validateEmailAddress(email);
        Assertions.assertEquals(false,result);
    }

    @Test
    public void multipleEmail_WhenValid_ReturnTrue() {
        EmailStorage emailStorage = new EmailStorage();
        emailStorage.addEmails();
        for(String email: emailStorage.validEmailIds) {
            passedEmail_WhenValid_ReturnTrue(email);
        }
    }

    @Test
    public void multipleEmail_WhenNotValid_ReturnFalse() {
        EmailStorage emailStorage = new EmailStorage();
        emailStorage.addEmails();
        for(String email: emailStorage.inValidEmailIds) {
            passedEmail_WhenNotValid_ReturnFalse(email);
        }
    }
}