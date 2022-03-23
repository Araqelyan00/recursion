package com.company;

public class Task5 {

    static int digit7(int n){
        if (n < 1) return 0;
        if (n % 10 == 7) return 1 + digit7(n / 10);
        else return digit7(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(digit7(777));
    }
}
