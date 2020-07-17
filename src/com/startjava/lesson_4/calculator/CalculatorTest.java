/*Модифицируйте программу Калькулятор, используя для хранения значений математического выражения массивы:
воспользуйтесь методами класса Math, какие только сможете найти, заменив ими ваши реализации, связанные с вычислениями
для разбиения математического выражения на составляющие и сохранения их в массив, используйте метод String.split();*/

/*Формат ввода математического выражения для программы Калькулятор (пример):
Введите математическое выражение: 2 ^ 10
Для преобразования аргументов математического выражения из типа String в int используйте метод Integer.parseInt
Создайте дополнительное поле в классе Player, которое будет хранить введенные пользователем числа
Для считывания части массива используйте метод Arrays.copyOf
Для обнуления массивов игроков, при повторном запуске игры, используйте метод Arrays.fill(). При этом обнуляйте только те ячейки, где хранятся, названные игроками числа
Попробуйте улучшить читаемость кода, разделив его на небольшие методы (рефакторинг)*/

package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        String answer = "";

        do {
            System.out.print("Введите первое число: ");
            calculator.setFirstNumber(input.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setMathOperation(input.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setSecondNumber(input.nextInt());
            calculator.calculate();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = input.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } while (answer.equals("да"));
    }
}

