package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import java.lang.Exception;

public class AnimalTest {

    @Test
    public void getAnimalTypeOfFoodTest() throws Exception {
        Animal animal = new Animal();
        String animalKind = "Травоядное";
        List<String> expectedTypeOfFood = List.of("Трава", "Различные растения");
        List<String> actualTypeOfFood = animal.getFood(animalKind);
        assertEquals(expectedTypeOfFood, actualTypeOfFood);
    }
    @Test
    public void animalTypeOfFoodTest() throws Exception {
        Animal animal = new Animal();
        String animalKind = "Хищник";
        List<String> expectedTypeOfFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualTypeOfFood = animal.getFood(animalKind);
        assertEquals(expectedTypeOfFood, actualTypeOfFood);
    }


    @Test
    public void getFamilyMessageTest(){
        Animal animal = new Animal();
        String expectedMessage = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualMessage = animal.getFamily();
        assertEquals(expectedMessage, actualMessage);
    }
}
