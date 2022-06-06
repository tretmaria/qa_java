package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    boolean hasKittens;

    public Lion(String sex, Feline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
            hasKittens = false;
            feline.getKittens(0);

        } else if ("Самка".equals(sex)) {
            hasMane = false;
            hasKittens = true;
            feline.getKittens(1);
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    Feline feline = new Feline();

    public int getKittens() {

        return feline.getKittens();
    }

    public boolean doesHaveMane() {

        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}