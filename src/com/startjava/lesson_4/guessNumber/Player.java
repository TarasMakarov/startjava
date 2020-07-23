package com.startjava.lesson_4.guessNumber;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attempt;

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }
}