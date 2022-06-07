import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    @Mock
    Feline feline;

    @Test
    public void doesLionHaveKittens() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(0);
        lion.getKittens();
        System.out.println(lion.getKittens());
    }
}
