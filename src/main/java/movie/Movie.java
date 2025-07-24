package movie;

import java.math.BigDecimal;
import java.net.URL;
import java.util.List;

@lombok.Data
public class Movie {

    private String title;
    private int year;
    private BigDecimal rating;
    private int votes;
    private List<String> genres;
    private URL url;

}