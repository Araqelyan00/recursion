package com.company;

public class Task4 {

    static int sumOfDigits(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sumOfDigits(n / 10));
    }

    // Driven Program to check above
    public static void main(String args[])
    {
        int num = 12345;
        int result = sumOfDigits(num);
        System.out.println("Sum of digits is : "+ result);
    }
}
