package com.startjava.lesson_4.guessNumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int compNumber;
    Scanner input = new Scanner(System.in);

    private Player player1;
    private Player player2;

    private int counter;
    private boolean winPlayer2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guessGame() {
        counter = 0;
        sayHello();
        guessCompNumber();
        do {
            if (counter > 9) {
                break;
            }
            inputNumber(player1);
            if (!compareNums(player1)) {
                counter--;
                inputNumber(player2);
                if (compareNums(player2)) {
                    winPlayer2 = true;
                    break;
                }
            } else {
                break;
            }
        } while (true);
        gameOver(player1);
        System.out.println();
        gameOver(player2);
        System.out.println();
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
        player.getNumbers()[counter] = input.nextInt();
        System.out.println("Я думаю, это число: " + player.getNumbers()[counter]);
        counter++;
    }

    private boolean compareNums(Player player) {
        if (compNumber == player.getNumbers()[counter - 1]) {
            System.out.println(player.getName() + ", Вы угадали!");
            System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + counter + " попытки.");
            return true;
        } else {
            String answerCompareNum = compNumber < player.getNumbers()[counter - 1] ? " больше " : " меньше ";
            System.out.println("Введенное вами число" + answerCompareNum + "того, что загадал компьютер");
            return false;
        }
    }

    private void gameOver(Player player) {
        if (counter > 9) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
        System.out.print("Игрок " + player.getName() + " называл числа: ");
        int[] copyNumbers = Arrays.copyOf(player.getNumbers(), counter);
        for (int i = 0; i < copyNumbers.length; i++) {
            System.out.print(copyNumbers[i] + " ");
        }
        if (!winPlayer2) {
            counter--;
        }
    }
}