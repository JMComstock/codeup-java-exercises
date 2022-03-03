package movies;

public class Movie {

    public String name;
    public String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public static Movie[] add(Movie[] movie, Movie newMovie) {

        Movie[] newMovieArr = new Movie[movie.length + 1];
        for(int i = 0; i < movie.length; i++) {
            newMovieArr[i] = movie[i];
        }
        newMovieArr[newMovieArr.length - 1] = newMovie;

        return newMovieArr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
