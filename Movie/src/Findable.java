import java.util.List;

public interface Findable {
      void getAllMovies(List<Movie>movies);
      void findMovieByName(List<Movie>movies, String name);
      void findMovieByActorName(List<Movie>movies, String actorFullName);
      void findMovieByYear(List<Movie>movies, int year);
      void findMovieByDirector(List<Movie>movies, Director director);
      void findMovieByDescription(List<Movie>movies, String description);
      void findMovieByRole(List<Movie>movies, String role);

      ;
}
