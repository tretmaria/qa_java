package com.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;


public class ErrorMessage {
    @Test(expected = Exception.class)
    public void showErrorMessageTest() throws Exception{
            Animal animal = new Animal();
            animal.getFood(" ");
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
    }

    @Test(expected = Exception.class)
    public void errorMessageTest() throws Exception{
            Feline feline = new Feline();
            Lion lion = new Lion(" ", feline);
            lion.doesHaveMane();
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
    }
    @Test
    public void getErrorMessageTest() {
        try {
            Animal animal = new Animal();
            animal.getFood(" ");
            fail();
        } catch (Exception exception) {
            assertThat(exception.getMessage(), is("Неизвестный вид животного, используйте значение Травоядное или Хищник"));
        }
    }

}
