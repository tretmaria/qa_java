package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void shouldEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedToEatMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualTypeOfFood = feline.getFood("Хищник");
        assertEquals(expectedToEatMeat, actualTypeOfFood);
    }
    @Test
    public void shouldGetFamilyTest() {
        Feline feline = new Feline();
        String expectedFamilyGroup = "Кошачьи";
        String actualFamilyGroup = feline.getFamily();
        assertEquals(expectedFamilyGroup, actualFamilyGroup);
    }


    @Test
    public void shouldHaveOneKitten(){
        Feline feline = new Feline();
        int expectedToHaveOneKitten = 1;
        int actualNumberOfKittens = feline.getKittens();
        assertEquals(expectedToHaveOneKitten, actualNumberOfKittens);
    }
}
