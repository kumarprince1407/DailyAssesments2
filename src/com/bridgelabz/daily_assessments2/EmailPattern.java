package com.bridgelabz.daily_assessments2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPattern {
    public static boolean emailRegex(String email){
        final String EMAIL_REGEX = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+\\.[a-z]{2,}$";
        Pattern pattern =Pattern.compile(EMAIL_REGEX);
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to E-mail pattern validator program.");
        System.out.print("Enter email: ");
        Scanner sc = new Scanner(System.in);
        String email=sc.nextLine();

        if(emailRegex(email)){
            System.out.println("Valid email.");
        }else{
            System.out.println("Invalid email");
        }
    }
}
