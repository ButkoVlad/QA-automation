package com;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        System.out.print("Enter your name: ");

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);
        scan.close();

    }
}
