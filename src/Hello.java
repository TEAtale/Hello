import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Hello {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");
        System.out.println(cube(3L));
        Map<String, String> map = new LinkedHashMap<>();

        map.put("name", "null");
        map.put("country", "null");
        map.put("city", "null");
        map.put("age", "null");

        System.out.println(getQuery(map));
    }
    public static long cube (long a){

        return (a*a*a);
    }
    public static String getQuery(Map<String, String> params) {

        return params.entrySet().stream().filter(p -> p.getValue() != null)
                .map(p -> p.getKey() + " = " + p.getValue()).collect(Collectors.joining(", "));
    }

}




