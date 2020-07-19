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
        compNumber = (int) (Math.random() * 101);
        System.out.println("Компьютер загадал свое число. И это число: " + compNumber);
        do {
            if (counter > 9) {
                gameOver(player1);
                System.out.println();
                gameOver(player2);
                System.out.println();
                break;
            }
            System.out.println(player1.getName() + ", как Вы думаете, какое число загадал компьютер?");
            player1.setNumber(input.nextInt());
            System.out.println("Я думаю, это число: " + player1.getNumber());
            fillArray(player1);

            if (!compareNums(player1)) {
                counter--;
                System.out.println(player2.getName() + ", как Вы думаете, какое число загадал компьютер?");
                player2.setNumber(input.nextInt());
                fillArray(player2);
                System.out.println("Я думаю, это число: " + player2.getNumber());
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
        if (compNumber == player.getNumber()) {
            System.out.println(player.getName() + ", Вы угадали!");
            System.out.println("Игрок " + player.getName() + " угадал число " + compNumber + " с " + counter + " попытки.");
            counter = 0;
            Arrays.fill(player1.getNumbs(), 0);
            Arrays.fill(player2.getNumbs(), 0);
            return true;
        } else {
            String answerCompareNum = compNumber < player.getNumber() ? " больше " : " меньше ";
            System.out.println("Введенное вами число" + answerCompareNum + "того, что загадал компьютер");
            return false;
        }
    }

    private void fillArray(Player player) {
        player.getNumbs()[counter] = player.getNumber();
        counter++;
    }

    private void gameOver(Player player) {
        System.out.println("У " + player.getName() + " закончились попытки.");
        System.out.print("Игрок " + player.getName() + " называл числа: ");
        for (int i = 0; i < player.getNumbs().length; i++) {
            System.out.print(player.getNumbs()[i] + " ");
        }
        Arrays.fill(player.getNumbs(), 0);
        counter = 0;
    }
}
