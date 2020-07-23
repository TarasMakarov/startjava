package com.startjava.lesson_4.guessNumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int compNumber;
    Scanner input = new Scanner(System.in);

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guessGame() {
        player1.setAttempt(0);
        player2.setAttempt(0);
        sayHello();
        guessCompNumber();
        do {
            if (player1.getAttempt() > 9) {
                break;
            }
            inputNumber(player1);
            if (!compareNumbers(player1)) {
                inputNumber(player2);
                if (compareNumbers(player2)) {
                    break;
                }
            } else {
                break;
            }
        } while (true);
        showNumbers(player1);
        showNumbers(player2);
        Arrays.fill(player1.getNumbers(), 0);
        Arrays.fill(player2.getNumbers(), 0);
    }

    private void sayHello() {
        System.out.println("Игрок под номером 1");
        System.out.println("Меня зовут " + player1.getName());
        System.out.println("Игрок под номером 2");
        System.out.println("Меня зовут " + player2.getName());
        System.out.println("Сегодня с нами играют: " + player1.getName() + " и " + player2.getName() + " !!!");
        System.out.println("У вас есть 10 попыток!");
    }

    private void guessCompNumber() {
        compNumber = (int) (Math.random() * 101);
        System.out.println("Компьютер загадал свое число. И это число: " + compNumber);
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + ", как Вы думаете, какое число загадал компьютер?");
        player.getNumbers()[player.getAttempt()] = input.nextInt();
        System.out.println("Я думаю, это число: " + player.getNumbers()[player.getAttempt()]);
        player.setAttempt(player.getAttempt() + 1);
    }

    private boolean compareNumbers(Player player) {
        if (compNumber == player.getNumbers()[player.getAttempt() - 1]) {
            System.out.println(player.getName() + ", Вы угадали!");
            System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + player.getAttempt() + " попытки.");
            return true;
        } else {
            String answerCompareNum = compNumber < player.getNumbers()[player.getAttempt() - 1] ? " больше " : " меньше ";
            System.out.println("Введенное вами число" + answerCompareNum + "того, что загадал компьютер");
            return false;
        }
    }

    private void showNumbers(Player player) {
        if (player.getAttempt() > 9) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
        System.out.print("Игрок " + player.getName() + " называл числа: ");
        int[] copyNumbers = Arrays.copyOf(player.getNumbers(), player.getAttempt());
        for (int i = 0; i < copyNumbers.length; i++) {
            System.out.print(copyNumbers[i] + " ");
        }
        System.out.print("\n");
    }
}