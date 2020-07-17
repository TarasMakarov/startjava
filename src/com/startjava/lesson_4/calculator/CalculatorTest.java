package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[2];
        String answer = null;

        do {
            System.out.print("Введите математическое выражение: ");
            String mathExample = input.nextLine();
            String[] membersExample = mathExample.split(" ");
            calculator.setFirstNumber(Integer.parseInt(membersExample[0]));
            calculator.setSecondNumber(Integer.parseInt(membersExample[2]));
            calculator.setMathOperation(membersExample[1].charAt(0));

            calculator.calculate();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = input.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}