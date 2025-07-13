package com.kodilla46;

public class Calculator {
long FirstNumber;
long SecondNumber;

    public Calculator(long firstNumber, long secondNumber) {
        FirstNumber = firstNumber;
        SecondNumber = secondNumber;
    }

    public Long Calculate( String Operation){
        if (Operation == "addition"){
            return FirstNumber + SecondNumber;
        }
        else if (Operation =="subtraction"){
            return FirstNumber - SecondNumber;
        }
        return null;
    }
//    public void main(String[] args) {
//        System.out.println(Calculate((long) 1, (long)2,"addition"));
//
//    }
}
