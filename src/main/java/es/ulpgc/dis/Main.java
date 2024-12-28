package es.ulpgc.dis;

import es.ulpgc.dis.control.GenreFrequencyProcessor;
import es.ulpgc.dis.control.TsvMovieLoader;
import es.ulpgc.dis.model.Movie;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/resources/title.basics3small.tsv");
        TsvMovieLoader loader = new TsvMovieLoader(file);
        GenreFrequencyProcessor processor = new GenreFrequencyProcessor();

        List<Movie> movies = loader.loadMovies();
        Map<String, Integer> genreprocess = processor.process(movies);

        for (String key : genreprocess.keySet().stream().sorted().toList()) {
            System.out.println(key + ": " + genreprocess.get(key));
        }
    }
}
