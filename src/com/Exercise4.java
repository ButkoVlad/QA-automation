package com;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        String pas = "finalize";
        System.out.print("Enter password: ");

        Scanner scan = new Scanner(System.in);
        String password = scan.next();
        System.out.println("Password: " + password);
        scan.close();
        System.out.println(pas.equals(password));




    }
}
