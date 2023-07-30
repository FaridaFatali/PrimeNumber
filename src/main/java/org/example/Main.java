package org.example;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=pY-gMIdPxVk&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=29
 * @author Farida Fatali
 */

// Checking if the number entered by the user is prime.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}