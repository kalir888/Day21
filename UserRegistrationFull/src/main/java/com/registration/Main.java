package com.registration;

public class Main {
    public static void main(String args[]) {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.getUserDetails();
        } catch (UserDetailException e) {
            e.printStackTrace();
        }
    }
}
