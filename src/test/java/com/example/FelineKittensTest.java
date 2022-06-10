package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineKittensTest {
    private final String sex;
    private final int expectedNumberOfKittens;
    private final int kittensCount;


    public FelineKittensTest(String sex, int kittensCount, int expectedNumberOfKittens) {
        this.sex = sex;
        this.expectedNumberOfKittens = expectedNumberOfKittens;
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
    public void shouldHaveMoreThanOneKitten() {
        Feline feline = new Feline();
        int actualNumberOfKittens = feline.getKittens(expectedNumberOfKittens);
        Assert.assertEquals(expectedNumberOfKittens, actualNumberOfKittens);
    }
}
