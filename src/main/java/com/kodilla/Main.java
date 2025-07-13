package com.kodilla;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator((long) 3, (long) 4);
        System.out.println(calculator.Calculate("addition"));
        System.out.println(calculator.Calculate("subtraction"));
    }
}