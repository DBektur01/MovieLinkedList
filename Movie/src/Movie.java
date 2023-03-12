import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie implements  Sortable,Findable{
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast>casts;

    public Movie(String name, int year, String description, Director director, List<Cast>casts) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.casts=casts;
    }

    public Movie() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }
    public List<Cast> getCasts() {
        return casts;
    }
    public void setCasts(List<Cast> casts) {
        this.casts = casts;
    }
    @Override
    public void getAllMovies(List<Movie> movies) {
        for (Movie all:movies) {
            System.out.println(all);
        }
    }
    @Override
    public void findMovieByName(List<Movie> movies, String name) {
        for (Movie m:movies) {
            if(m.getName().equals(name)){
                System.out.println(m);
            }
        }
    }
    @Override
    public void findMovieByActorName(List<Movie> movies, String actorFullName) {
        for (Movie m:movies) {
            for (Cast c:m.getCasts()){
                if(c.getActorFullName().equals(actorFullName)){
                    System.out.println(m);
                }
            }
        }
    }
    @Override
    public void findMovieByYear(List<Movie> movies, int year) {
        for (Movie m:movies) {
            if(m.getYear()==year){
                System.out.println(m);
            }
        }
    }
    @Override
    public void findMovieByDirector(List<Movie> movies, Director director) {
        for (Movie m:movies) {
            if(m.getDirector().equals(director)){
                System.out.println(m);
            }
        }
    }
    @Override
    public void findMovieByDescription(List<Movie> movies, String description) {
        for (Movie m:movies) {
            if(m.getDescription().equals(description)){
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies, String role) {
        for (Movie m:movies) {
            for (Cast c:m.getCasts()){
                if(c.getRole().equals(role)){
                    System.out.println(m+" "+c);
                }
            }
        }
    }

    @Override
    public void sortByMovieName(List<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    @Override
    public void sortByMovieYear(List<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return Integer.compare(o1.getYear(),o2.getYear());
            }
        });
    }
    @Override
    public void sortByMovieDirector(List<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getDirector().getName().compareTo(o2.getDirector().getName());
            }
        });
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", director=" + director +
                ", casts=" + casts +
                '}';
    }

}
