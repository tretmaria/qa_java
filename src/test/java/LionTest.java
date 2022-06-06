//import com.example.Feline;
//import com.example.Lion;
package com.example;

import net.bytebuddy.build.Plugin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionTest {
    Feline feline = new Feline();
    private final String sex;
    private boolean expectedToHaveMane;
    public LionTest(String sex, boolean expectedToHaveMane) {
        this.sex = sex;
        this.expectedToHaveMane = expectedToHaveMane;
    }

    @Parameterized.Parameters
    public static Object[][] getGender() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesLionHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedToHaveMane, lion.doesHaveMane());
    }
    @Test
    public void shouldSendErrorMessageTest() throws Exception {
        try {
            Lion lion = new Lion(" ", feline);
            lion.doesHaveMane();
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }
}
