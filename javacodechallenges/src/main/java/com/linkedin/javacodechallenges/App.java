package com.linkedin.javacodechallenges;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {

    // password must have at least 6 char
    // at least one uppercase
    // at least one lower
    // one number
    public static boolean isPasswordComplex(String password) {
        // A regex to look for the pattern inside
        // the password string
        String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)";
        Matcher matcher = Pattern.compile(regex).matcher(password);
        if (matcher.find() && password.length() >= 6) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
