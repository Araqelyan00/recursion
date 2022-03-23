package com.company.task1;

import java.util.Scanner;

import static com.company.task1.Factorial.factorial;
import static com.company.task1.Fibonacci.fibonacci;

public class Main {

    public static void main(String[] args) {
        System.out.print("Input a number : ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
	System.out.println("Factorial of number is: " + factorial(x));
    System.out.println("Fibonacci element is: " + fibonacci(x));

    }

}
