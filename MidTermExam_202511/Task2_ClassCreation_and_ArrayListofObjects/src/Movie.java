public class Movie {
        String title;
        String director;
        double rating;

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    protected boolean isRecommended(double minRating) {
        if (minRating >= 7.5 && minRating <= 10) {
        }
        return false;
    }

    private void displayMovieInfo() {
        System.out.println("Movie: " + title + " directed by " + director + ", Rating: " + rating + "/10");
    }



}
