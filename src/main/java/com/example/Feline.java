package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

//    Animal animal;
//    public Feline (Animal animal){
//        this.animal = animal;
//    }

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}