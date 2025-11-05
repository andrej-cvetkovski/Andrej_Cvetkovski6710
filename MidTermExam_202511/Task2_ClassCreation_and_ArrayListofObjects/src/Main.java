import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Movie> movieList = new ArrayList<>(5);

        movieList.add(new Movie("Inception", "Christopher Nolan", 8.8));
        movieList.add(new Movie("The Shawshank Redemption", "Frank Darabont", 9.3));
        movieList.add(new Movie("The Room", "Tommy Wiseau", 3.7));
        movieList.add(new Movie("Parasite", "Bong Joon-ho", 8.5));

        System.out.println("All Movies:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }

        double minRating = 7.5;

        System.out.println("Movies with rating >= " + minRating + ":");
        for (Movie movie : movieList) {
            if (movie.isRecommended(minRating)) {
                System.out.println(movie);
            }
        }

        }
    }