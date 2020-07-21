package com.startjava.lesson_4.guessNumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int compNumber;
    Scanner input = new Scanner(System.in);

    private Player player1;
    private Player player2;

    private int counter = 0;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guessGame() {
        sayHello();
        guessCompNumber();
        do {
            if (counter > 9) {
                gameOver(player1);
                outputNumbers(player1);
                System.out.println();
                gameOver(player2);
                outputNumbers(player2);
                System.out.println();
                Arrays.fill(player1.getNumbers(), 0);
                Arrays.fill(player2.getNumbers(), 0);
                counter = 0;
                break;
            }
            inputNumbers(player1);
            if (!compareNums(player1)) {
                counter--;
                inputNumbers(player2);
                if (compareNums(player2)) {
                    break;
                }
            } else {
                break;
            }
        } while (true);
    }

    private void sayHello() {
        System.out.println("Игрок под номером 1");
        System.out.println("Меня зовут " + player1.getName());
        System.out.println("Игрок под номером 2");
        System.out.println("Меня зовут " + player2.getName());
        System.out.println("Сегодня с нами играют: " + player1.getName() + " и " + player2.getName() + " !!!");
        System.out.println("У вас есть 10 попыток!");
    }

    private boolean compareNums(Player player) {
        if (compNumber == player.getNumbers()[counter - 1]) {
            System.out.println(player.getName() + ", Вы угадали!");
            System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + counter + " попытки.");
            outputNumbers(player1);
            System.out.println();
            if (player.equals(player1)) {
                counter--;
            }
            outputNumbers(player2);
            System.out.println();
            counter = 0;
            Arrays.fill(player1.getNumbers(), 0);
            Arrays.fill(player2.getNumbers(), 0);
            return true;
        } else {
            String answerCompareNum = compNumber < player.getNumbers()[counter - 1] ? " больше " : " меньше ";
            System.out.println("Введенное вами число" + answerCompareNum + "того, что загадал компьютер");
            return false;
        }
    }

    private void outputNumbers (Player player) {
        System.out.print("Игрок " + player.getName() + " называл числа: ");
        int[] copyNumbers = Arrays.copyOf(player.getNumbers(), counter);
        for (int i = 0; i < copyNumbers.length; i++) {
            System.out.print(copyNumbers[i] + " ");
        }
    }

    private void gameOver(Player player) {
        System.out.println("У " + player.getName() + " закончились попытки.");
    }

    private void guessCompNumber() {
        compNumber = (int) (Math.random() * 101);
        System.out.println("Компьютер загадал свое число. И это число: " + compNumber);
    }

    private void inputNumbers(Player player) {
        System.out.println(player.getName() + ", как Вы думаете, какое число загадал компьютер?");
        player.getNumbers()[counter] = input.nextInt();
        System.out.println("Я думаю, это число: " + player.getNumbers()[counter]);
        counter++;
    }
}