package com.chosen;

public class Main {
    public static void main(String[] args) {
        basic_arithmetic calculator = new basic_arithmetic();
        int num1 = 5;
        int num2 = 5;
        int sum;

        sum = calculator.add(num1, num2);
        System.out.println(sum);
    }

}
