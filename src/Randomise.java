import org.mockito.stubbing.Answer;

import java.util.Random;

import static org.mockito.Mockito.*;

public class Randomise {
private final Random random;

    public static void main(String[] args) {


        Random random = mock(Random.class, withSettings().serializable());
        /*Randomise randomise = new Randomise(mock);
        int val = 10;
        when(mock.nextInt(val)).thenReturn(3);
        int r = randomise.getRandom(val);
        System.out.println(r);*/
    }

    public Randomise(Random random) {
        this.random = random;
    }

    public int getRandom(int a) {
        int i = random.nextInt(a);
        if (i > 5) {
            throw new IllegalArgumentException("i > 5" + i);
        }
        return i;
    }
}
