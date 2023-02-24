package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationRegex {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("---Welcome To The User Registration Program---");
        System.out.println("==============================================");

        System.out.print("Enter Your First Name : ");
        String firstname = sc.nextLine();

        if (Pattern.matches("^[A-Z][a-z]{3,}$", firstname)) {

            System.out.println("Check : First Name is Valid");
        } else {
            System.out.println("Check : First Name is Invalid");
        }

        //UC2
        System.out.println();

        System.out.print("Enter Your LastName : ");
        String lastName = sc.nextLine();

        if (Pattern.matches("^[A-Z][a-z]{3,}$", lastName)) {

            System.out.println("Check : Last name is Valid");
        } else {
            System.out.println("Check : Last name Invalid");
        }

        //UC3
        System.out.println();

        System.out.print("Enter Your Email Address : ");
        String email = sc.nextLine();

        if (Pattern.matches("^[a-zA-Z]+[a-zA-Z0-9]*[-.+_]?[a-zA-Z0-9]+(@)[a-z0-9]+[.][a-z]+[.]?[a-z]+$", email)) {

            System.out.println("Check : Email is Valid");
        } else {
            System.out.println("Check : Email Invalid");
        }

        //UC4
        System.out.println();

        System.out.print("Enter Your PhoneNumber : ");
        String phoneNumber = sc.nextLine();

        if (Pattern.matches("^[1-9]{2}\\s[0-9]{10}$", phoneNumber)) {

            System.out.println("Check : Phone Number is Valid ");
        } else {
            System.out.println("Check : Phone Number is Invalid ");
        }










    }

}
