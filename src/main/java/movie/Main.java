package movie;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.net.URI;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        var objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

        var movie = new Movie();
        movie.setTitle("Shrek");
        movie.setYear(2001);
        movie.setRating(new BigDecimal("7.9"));
        movie.setVotes(773608);
        movie.setGenres(List.of("animation", "adventure", "comedy"));
        movie.setUrl(new URI("https://www.imdb.com/title/tt0126029/").toURL());

        System.out.println(objectMapper.writeValueAsString(movie));

        try (var writer = new FileWriter("movie.json")) {
            objectMapper.writeValue(writer, movie);
        }
        System.out.println(objectMapper.readValue(new FileReader("movie.json"), Movie.class));
    }

}
