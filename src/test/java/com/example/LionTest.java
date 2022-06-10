package com.example;

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
    public static Object[][] hasMane() {
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


}
