package com.registration;

import java.util.Scanner;

public class UserRegistration {
    UserValidator userValidator = new UserValidator();
    Scanner get = new Scanner(System.in);

    public void getUserDetails() throws UserDetailException {
        getUserFirstName();
        getUserLastName();
        getUserEmailId();
        getPassWord();
    }

    private void getUserFirstName() throws UserDetailException {
        System.out.println("Enter your First Name");
        String firstName = get.next();
        if(!userValidator.validateName(firstName))
            throw new UserDetailException("Invalid First Name");
    }

    private void getUserLastName() throws UserDetailException {
        System.out.println("Enter your Last Name");
        String secondName = get.next();
        if(!userValidator.validateName(secondName))
            throw new UserDetailException("Invalid Last Name");
    }

    private void getUserEmailId() throws UserDetailException {
        System.out.println("Enter your Email Id");
        String emailId = get.next();
        if(!userValidator.validateEmailAddress(emailId))
            throw new UserDetailException("Invalid Email Id");
    }

    private void getPassWord() throws UserDetailException {
        System.out.println("Enter your PassWord");
        String passWord = get.next();
        if(!userValidator.validatePassword(passWord))
            throw new UserDetailException("Invalid Password");
    }
}
