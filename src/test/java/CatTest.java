//import com.example.Animal;
//import com.example.Cat;
//import com.example.Feline;
//import com.example.Predator;
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
public class CatTest {

    @Test
    public void getMeowSoundTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }
    @Mock
    Predator predator;
    @Test
    public void DoesCatEatMeatTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Mockito.when(predator.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualCatTypeOfFood = cat.getFood();
        assertEquals(expectedEatMeat, actualCatTypeOfFood);
    }
}
