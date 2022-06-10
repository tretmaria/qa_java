package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class ErrorMessage {
    @Test(expected = Exception.class)
    public void showErrorMessageTest() throws Exception {
            Animal animal = new Animal();
            animal.getFood(" ");
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
    }

    @Test(expected = Exception.class)
    public void errorMessageTest() throws Exception {
            Feline feline = new Feline();
            Lion lion = new Lion(" ", feline);
            lion.doesHaveMane();
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
    }
    @Test
    public void getErrorMessagesTest() throws Exception {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion(" ", feline);
            lion.doesHaveMane();
            fail();
        } catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }
}
