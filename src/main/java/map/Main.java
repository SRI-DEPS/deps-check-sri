package map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        var objectMapper = new ObjectMapper();
        var ref = new TypeReference<Map<String, String>>() {};
        Map<String, String> map = objectMapper.readValue(new URI("https://country.io/names.json").toURL(), ref);
        System.out.println(map);
    }

}
