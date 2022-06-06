import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {
    private final int expectedNumberOfKittens;

    public FelineTest(int expectedNumberOfKittens) {
        this.expectedNumberOfKittens = expectedNumberOfKittens;
    }

    @Test
    public void shouldEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedToEatMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualTypeOfFood = feline.getFood("Хищник");
        assertEquals(expectedToEatMeat, actualTypeOfFood);
    }

    @Test
    public void shouldGetFamilyTest() {
        Feline feline = new Feline();
        String expectedFamilyGroup = "Кошачьи";
        String actualFamilyGroup = feline.getFamily();
        assertEquals(expectedFamilyGroup, actualFamilyGroup);
    }

    @Test
    public void getErrorMessageTest() throws Exception {
        try {
            Animal animal = new Animal();
            animal.getFood(" ");
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    @Test
    public void shouldHaveOneKittenTest (){
        Feline feline = new Feline();
        int expectedToHaveOneKitten = 1;
        int actualNumberOfKittens = feline.getKittens();
        assertEquals(expectedToHaveOneKitten, actualNumberOfKittens);
    }

    @Parameterized.Parameters
    public static Object[][] getDataForKittens() {
        return new Object[][] {
                {2},
                {3},
                {4},
                {5},
        };
    }

    @Test
    public void ShouldHaveMoreThanOneKittenTest() {
        Feline feline = new Feline();
        int actualNumberOfKittens = feline.getKittens();
        Assert.assertEquals(expectedNumberOfKittens, actualNumberOfKittens);
    }

}
