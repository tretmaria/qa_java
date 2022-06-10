package com.example;

import org.junit.Test;


public class ErrorMessage {
    @Test(expected = Exception.class)
    public void showErrorMessageTest() throws Exception {
        try {
            Animal animal = new Animal();
            animal.getFood(" ");
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    @Test(expected = Exception.class)
    public void errorMessageTest() throws Exception {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion(" ", feline);
            lion.doesHaveMane();
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }
//    @Test
//    public void getErrorMessagesTest() throws Exception {
//        try {
//            Feline feline = new Feline();
//            Lion lion = new Lion(" ", feline);
//            lion.doesHaveMane();
//            fail();
//        } catch (Exception exception) {
//            assertThat(exception.getMessage(), is("Используйте допустимые значения пола животного - самец или самка"));
//        }
//    }
}
