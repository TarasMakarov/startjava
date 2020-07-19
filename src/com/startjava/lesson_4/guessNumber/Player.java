package com.startjava.lesson_4.guessNumber;

public class Player {
    private String name;
    private int number;
    private int[] numbs = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getNumbs() {
        return numbs;
    }

}
