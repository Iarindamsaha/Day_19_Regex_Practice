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

        //UC5( Password >> Rule 1)
        //System.out.println();
//
        //System.out.print("Enter Your Password : ");
        //String passWord = sc.nextLine();
//
        //if (Pattern.matches("^[A-Za-z]{8,}$", passWord)) {
//
        //    System.out.println("Check : Password is Valid ");
        //} else {
        //    System.out.println("Check : Password is Invalid || Password Must Contain 8 Characters ");
        //}

//        //UC6( Password >> Rule 2)
//        System.out.println();
//
//        System.out.print("Enter Your Password : ");
//        String passWord = sc.nextLine();
//
//        if (Pattern.matches("^(?=.*[A-Z])[a-z].{8,}$", passWord)) {
//
//            System.out.println("Check : Password is Valid ");
//        } else {
//            System.out.println("Check : Password is Invalid || Password Must Contain One Capital Letter with 8 Characters ");
//        }

 //       //UC7( Password >> Rule 3)
 //       System.out.println();
//
 //       System.out.print("Enter Your Password : ");
 //       String passWord = sc.nextLine();
//
 //       if (Pattern.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{8,}$", passWord)) {
//
 //           System.out.println("Check : Password is Valid ");
 //       } else {
 //           System.out.println("Check : Password is Invalid || Password Must Contain One Capital Letter with 8 Characters ");
 //       }

        //UC7( Password >> Rule 3)
        System.out.println();

        System.out.print("Enter Your Password : ");
        String passWord = sc.nextLine();

        if (Pattern.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=.*[a-z]).{8,}$", passWord)) {

            System.out.println("Check : Password is Valid ");
        } else {
            System.out.println("|| Check : Password is Invalid ||\nPassword Must Contain One Capital Letter\n" +
                    "Password Must Contain One Number\nPassword Must Contain One Special Character");
        }












    }

}
