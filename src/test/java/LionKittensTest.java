package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionKittensTest {
    Feline feline = new Feline();
    private final String sex;
    private final int expectedNumberOfLionKittens;
    private final int kittensCount;

    public LionKittensTest(String sex, int kittensCount, int expectedNumberOfLionKittens) {
        this.sex = sex;
        this.expectedNumberOfLionKittens = expectedNumberOfLionKittens;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getNumberOfKittens() {
        return new Object[][] {
                {"Самка", 1, 1},
                {"Самка", 3, 3},
                {"Самец", 0, 0},
        };
    }
    @Test
    public void haveKittensTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        int actualNumberOfKittens = lion.feline.getKittens(kittensCount);
        System.out.println(actualNumberOfKittens);
        assertEquals(expectedNumberOfLionKittens, actualNumberOfKittens);
    }

}
