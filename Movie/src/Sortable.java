import java.util.List;
public interface Sortable {

    void sortByMovieName(List<Movie> movies);

    void sortByMovieYear(List<Movie> movies);

    void sortByMovieDirector(List<Movie> movies);
}
