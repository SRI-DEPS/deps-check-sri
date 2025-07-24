import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        var objectMapper = new ObjectMapper();
        var s1 = objectMapper.writeValueAsString(Math.PI);
        var s2 = objectMapper.writeValueAsString("Hello, World!");
        var s3 = objectMapper.writeValueAsString(false);
        var s4 = objectMapper.writeValueAsString(null);
        var s5 = objectMapper.writeValueAsString(new int[] {1, 2, 3, 4, 5});

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        var result1 = objectMapper.readValue(s1, Double.class);
        var result2 = objectMapper.readValue(s2, String.class);
        var result3 = objectMapper.readValue(s3, Boolean.class);
        var result4 = objectMapper.readValue(s4, Object.class);
        var result5 = objectMapper.readValue(s5, int[].class);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(Arrays.toString(result5));
    }

}
