package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionFoodTest {
    @Mock
    Feline feline;
    @Test
    public void getLionTypeOfFoodTest() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedLionTypeOfFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualLionTypeOfFood = lion.getFood();
        assertEquals(expectedLionTypeOfFood, actualLionTypeOfFood);
    }
}
