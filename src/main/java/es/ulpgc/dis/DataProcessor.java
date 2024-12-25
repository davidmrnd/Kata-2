package es.ulpgc.dis;

import java.util.List;
import java.util.Map;

public interface DataProcessor {
    Map<String, Integer> process(List<Movie> movies);
}
