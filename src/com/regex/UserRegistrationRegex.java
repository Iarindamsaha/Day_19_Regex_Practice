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



    }

}
