package com.startjava.lesson_4.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char mathOperation;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculate() {
        switch (mathOperation) {
            case '+':
                System.out.println("Сумма чисел равна: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Разность чисел равна: " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Произведение чисел равно: " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    System.out.println("Частное чисел равно: " + (firstNumber / secondNumber));
                }
                break;
            case '^':
                System.out.println("Результат возведения первого числа в степень равную второму числу: " + Math.pow(firstNumber, secondNumber));
                break;
            case '%':
                if (secondNumber == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    System.out.println("Результат деления по модулю первого числа на второе число равен: " + (firstNumber % secondNumber));
                }
        }
    }
}

