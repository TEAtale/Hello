import org.junit.BeforeClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.util.LinkedHashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;



class HelloTest {

    @BeforeAll
    public static void setAll() {
        System.out.println("Set all");
    }
    @BeforeEach
    public void setUp() {
        System.out.println("set up");
    }



    private static final String EXPECTED = "name = null, country = null, city = null, age = null";
    public static final Map<String, String> PARAMS = new LinkedHashMap<String,String>(){{
        put("name", "null");
        put("country", "null");
        put("city", "null");
        put("age", "null");
    }};

    @Test
   public void cube() {
        long expected = 27;
        long actual = Hello.cube(3);
        assertTrue(true);
        assertEquals(expected, actual);
    }

    @Test
    public void getQuery() {
        String actual = Hello.getQuery(PARAMS);
        assertTrue(actual != null);
        assertEquals(EXPECTED, actual);
    }



    @Test
    public void getQueryAssertJ() {
        String actual = Hello.getQuery(PARAMS);
        assertThat(actual).isNotNull().isEqualTo(EXPECTED);

    }
}