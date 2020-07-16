package com.startjava.lesson_1.guessNumber;

public class GuessNumber {
	public static void main(String[] args) {
		int compNumber = 38;
		int attempt = 0;
		
		while (attempt != compNumber) {
			if (compNumber < attempt) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				attempt--;
			} else {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				attempt++;
			}
		}
		System.out.println("Вы угадали!");
	}
}