import java.util.*;

public class Main {
    public static void main(String[] args) {
         Cast[]casts1={new Cast("Уилл Смит", " Роберт Невилл"), new Cast("Алисе Брага Мораеш ", "Анна ")};
         Cast[]casts2={new Cast("Джерард Батлер", "Царь Леонид"), new Cast("Лина Хиди", "Царица Горго")};
         Cast[]casts3={new Cast("Эндрю Гарфилдом", "Питеп"), new Cast("Эмма Стоун", "Гвен")};
         Cast[]casts4={new Cast("Эдвард Нортон", "Халк"), new Cast("Лив Тайлер", "Бетти Росс")};
         Cast[]casts5={new Cast("Уилл Смит", "Генри Броган"), new Cast("Клайв Оуэн", "Клей Варрис")};
         Cast[]casts6={new Cast("Генри Кавилл", "Супермен"), new Cast("Э́ми Лу А́дамс ", "Лоис Лейн")};



         Director director1= new Director("Фрэнсис", " Лоуренс");
         Director director2=new Director("Зак ", "Снайдер");
         Director director3 =new Director("Марк ", "Уэбб");
         Director director4=new Director("Луи́ ", "Летерье́ ");
         Director director5 =new Director("Энг  ", "Ли ");
         Director director6=new Director("Луи́ ", "Летерье́ ");


        Movie movie1=new Movie("Я Легенда", 2007, "фильм про людей, заражённых вирусом, изменившим их до неузнаваемости.",director1, List.of(casts1));
        Movie movie2=new Movie("Спартанцев 300 ", 2006, "Рассказ о кровопролитной битве при Фермопилах в 480 году до н. э",director2,List.of(casts2));
        Movie movie3=new Movie("Новый Человек-паук", 2012, "Укус паука — и жизнь подростка меняется навсегда", director3,List.of(casts3));
        Movie movie4=new Movie("Невероятный Халк", 2008, "История доктора Брюса Баннера, который ищет лекарство от своего необычного «заболевания»",director4, List.of(casts4));
        Movie movie5= new Movie("Гемини", 2019, "Генри Броган, первоклассный киллер, становится мишенью таинственного оперативника, который, кажется, знает каждый его шаг наперед…",director5,List.of(casts5) );
        Movie movie6=new Movie("Человек из стали", 2013, "Кларк Кент — молодой журналист, который чувствует себя чужаком из-за своей невероятной силы",director6,List.of(casts6));

        ArrayList<Movie>movies= new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);

        Scanner scanner = new Scanner(System.in);
                while(true) {
                    Movie movie = new Movie();
                    System.out.println("""
                            1 - All Movies
                            2 - Find movie by name
                            3 - Find movie by actor name
                            4 - Find movie by year
                            5 - Find movie by director
                            6 - Find movie by description
                            7 - Find movie by role
                            8 - Sort by movie name
                            9 - Sort by movie year
                            10 - Sort by movie director name
                            """);
                    int finder = scanner.nextInt();
                    switch (finder) {
                        case 1 -> movie.getAllMovies(movies);
                        case 2 -> movie.findMovieByName(movies, "Я Легенда");
                        case 3 -> movie.findMovieByActorName(movies, "Джерард Батлер");
                        case 4 -> movie.findMovieByYear(movies, 2012);
                        case 5 -> movie.findMovieByDirector(movies, movie3.getDirector());
                        case 6 -> movie.findMovieByDescription(movies, "История доктора Брюса Баннера, который ищет лекарство от своего необычного «заболевания»");
                        case 7 -> movie.findMovieByRole(movies, "Лоис Лейн");
                        case 8 ->{
                            movie.sortByMovieName(movies);
                            System.out.println(movies);
                        }
                        case 9 ->{
                            movie.sortByMovieYear(movies);
                            System.out.println(movies);
                        }
                        case  10-> {

                            movie.sortByMovieDirector(movies);
                            System.out.println(movies);
                        }
                    }
                }
             }
        }
