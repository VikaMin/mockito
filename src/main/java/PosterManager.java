package ru.netology.poster;

public class PosterManager {

    private Movie[] poster = new Movie[0];
    private int countMovies = 10;

    public PosterManager() {
    }

    public PosterManager(int countMovies) {
        if (countMovies >= 0) {
            this.countMovies = countMovies;
        }
    }


    public void addNewMovie(Movie movie) {
        Movie[] tmp = new Movie[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = movie;
        poster = tmp;
    }

    public Movie[] findAll() {
        return poster;
    }

    public Movie[] findLast() {
        Movie[] result = new Movie[Math.min(poster.length, countMovies)];
        for (int i = 0; i < result.length; i++) {
            int index = poster.length - i - 1;
            result[i] = poster[index];
        }
        return result;
    }


}

