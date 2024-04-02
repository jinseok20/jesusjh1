package com.ohgiraffers.level01.basic;

public class Calculator {

    public void checkMethod() {

        System.out.println("메소드 호출 확인");

    }

    public int  sumTwoNumber(int a, int b) {

        int sum = a + b;

        return sum;
    }

    public int minusTwoNumber(int a, int b) {

        int minus = a - b;

        return minus;
    }

    public int multiTwoNumber(int a, int b) {

        int multi = a * b;

        return multi;
    }

    public int divideTwoNumber(int a, int b) {

        int divide = a / b;

        return divide;
    }

}