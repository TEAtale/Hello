import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

class RandomiseTest {

    @Test
    void getRandom() {
        Random mock = mock(Random.class, withSettings().serializable());
        Randomise randomise = new Randomise(mock);
        int val = 10;
        int expected = 4;
        when(mock.nextInt(val)).thenReturn(expected);
        int r = randomise.getRandom(val);
        assertThat(r).isNotNegative().isLessThan(5).isEqualTo(expected);
        assertEquals(expected, r);
    }
}