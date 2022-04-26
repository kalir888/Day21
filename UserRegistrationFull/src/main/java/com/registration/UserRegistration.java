package com.registration;

import java.util.Scanner;

public class UserRegistration {
    UserValidator userValidator = new UserValidator();
    Scanner get = new Scanner(System.in);

    public void getUserDetails() throws UserDetailException {
        getUserFirstName();
        getUserLastName();
        getUserEmailId();
        getUserPhoneNo();
        getPassWord();
    }

    private void getUserFirstName() throws UserDetailException {
        System.out.println("Enter your First Name");
        userValidator.validateName(get.next());
    }

    private void getUserLastName() throws UserDetailException {
        System.out.println("Enter your Last Name");
        userValidator.validateName(get.next());
    }

    private void getUserPhoneNo() throws UserDetailException {
        System.out.println("Enter your Phone no");
        userValidator.validatePhoneNo(get.next());
    }

    private void getUserEmailId() throws UserDetailException {
        System.out.println("Enter your Email Id");
        userValidator.validateEmailAddress(get.next());
    }

    private void getPassWord() throws UserDetailException {
        System.out.println("Enter your PassWord");
        userValidator.validatePassword(get.next());
    }
}
