import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionTest {
    Feline feline = new Feline();
    private final String sex;
    private final boolean expectedToHaveMane;


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
        System.out.println(sex);
        assertEquals(expectedToHaveMane, lion.doesHaveMane());
    }

    @Parameterized.Parameters
    public static Object[][] getNumberOfKittens() {
        return new Object[][] {
                {"Самец" , 0},
                {"Самка", 1},
                {"Самка", 3},
                {"Самка", 4},
        };
    }
    @Test
    public void haveKittensTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        int actualNumberOfKittens = lion.getKittens();
        //int expectedNumberOfKittens = getNumberOfKittens;
        //Assert.assertEquals(expectedNumberOfKittens, actualNumberOfKittens);
    }
}
