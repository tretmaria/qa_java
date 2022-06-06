//import com.example.Feline;
//import com.example.Lion;
package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionKittensParameterizedTest {
    Feline feline = new Feline();
    private final String sex;
    private final int expectedNumberOfLionKittens;

    public LionKittensParameterizedTest(String sex, int expectedNumberOfLionKittens) {
        this.sex = sex;
        this.expectedNumberOfLionKittens = expectedNumberOfLionKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getNumberOfKittens() {
        return new Object[][] {
                {"Самка", 1},
                {"Самец", 0}
        };
    }
    @Test
    public void haveKittensTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        int actualNumberOfKittens = lion.getKittens();
        assertEquals(expectedNumberOfLionKittens, actualNumberOfKittens);
    }
    @Test
    public void sendErrorMessageTest() throws Exception {
        try {
            Lion lion = new Lion("Самец", feline);
            feline.getKittens(1);
        } catch (Exception exception) {
            System.out.println("У самцов нет детенышей");
        }
    }

}
