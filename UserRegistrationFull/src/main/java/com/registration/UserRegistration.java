package com.registration;

import java.util.Scanner;

public class UserRegistration {
    UserValidator userValidator = new UserValidator();
    Scanner get = new Scanner(System.in);

    public void getUserDetails() {
        getUserFirstName();
        getUserLastName();
        getUserEmailId();
        getPassWord();
    }

    private void getUserFirstName() {
        System.out.println("Enter your First Name");
        String firstName = get.next();
        if(!userValidator.validateName(firstName))
            System.out.println("Invalid First Name");
    }

    private void getUserLastName() {
        System.out.println("Enter your Second Name");
        String secondName = get.next();
        if(!userValidator.validateName(secondName));
            System.out.println("Invalid Second Name");
    }

    private void getUserEmailId() {
        System.out.println("Enter your Email Id");
        String emailId = get.next();
        if(!userValidator.validateEmailAddress(emailId))
            System.out.println("Invalid Email Id");
    }

    private void getPassWord() {
        System.out.println("Enter your PassWord");
        String passWord = get.next();
        if(!userValidator.validateName(passWord))
            System.out.println("Invalid PassWord");
    }
}
