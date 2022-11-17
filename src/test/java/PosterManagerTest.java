package ru.netology.poster;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PosterManager poster = new PosterManager();

    Movie movie1 = new Movie("Молчание ягнят", "драма, триллер, комедия");
    Movie movie2 = new Movie("Леон", "драма, триллер");
    Movie movie3 = new Movie("Унесенные призраками", "хоррор");
    Movie movie4 = new Movie("Кощей. Похититель невест", "анимация, мелодрама");
    Movie movie5 = new Movie("Дом дракона", "фэнтези, боевик");
    Movie movie6 = new Movie("Человек-паук: Возвращение домой", "фантастика, боевик, приключения");
    Movie movie7 = new Movie("Назад в будущее", "комедия");
    Movie movie8 = new Movie("Большое путешествие", "мультфильм, комедия, приключения, семейный");
    Movie movie9 = new Movie("Главная роль", "драма, комедия");
    Movie movie10 = new Movie("Паразиты", "драма, триллер, комедия");
    Movie movie11 = new Movie("Леон", "боевик, триллер, драма, криминал");


    @BeforeEach
    public void setup() {
        poster.addNewMovie(movie1);
        poster.addNewMovie(movie2);
        poster.addNewMovie(movie3);
        poster.addNewMovie(movie4);
        poster.addNewMovie(movie5);
        poster.addNewMovie(movie6);
        poster.addNewMovie(movie7);
        poster.addNewMovie(movie8);
        poster.addNewMovie(movie9);
        poster.addNewMovie(movie10);
        poster.addNewMovie(movie11);
    }

    @Test
    public void shouldFindAll() {
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};

        Movie[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithTenMovies() {
        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};

        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindWithFiveMovies() {
        PosterManager poster = new PosterManager(5);

        poster.addNewMovie(movie1);
        poster.addNewMovie(movie2);
        poster.addNewMovie(movie3);
        poster.addNewMovie(movie4);
        poster.addNewMovie(movie5);
        poster.addNewMovie(movie6);
        poster.addNewMovie(movie7);
        poster.addNewMovie(movie8);
        poster.addNewMovie(movie9);
        poster.addNewMovie(movie10);
        poster.addNewMovie(movie11);

        Movie[] expected = {movie11, movie10, movie9, movie8, movie7};

        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastWithOneMovie() {
        PosterManager poster = new PosterManager(1);

        poster.addNewMovie(movie1);
        poster.addNewMovie(movie2);
        poster.addNewMovie(movie3);
        poster.addNewMovie(movie4);
        poster.addNewMovie(movie5);
        poster.addNewMovie(movie6);
        poster.addNewMovie(movie7);
        poster.addNewMovie(movie8);
        poster.addNewMovie(movie9);
        poster.addNewMovie(movie10);
        poster.addNewMovie(movie11);

        Movie[] expected = {movie11};

        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithoutMovies() {
        PosterManager poster = new PosterManager(0);

        poster.addNewMovie(movie1);
        poster.addNewMovie(movie2);
        poster.addNewMovie(movie3);
        poster.addNewMovie(movie4);
        poster.addNewMovie(movie5);
        poster.addNewMovie(movie6);
        poster.addNewMovie(movie7);
        poster.addNewMovie(movie8);
        poster.addNewMovie(movie9);
        poster.addNewMovie(movie10);
        poster.addNewMovie(movie11);

        Movie[] expected = {};

        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastBelowZero() {
        PosterManager poster = new PosterManager(-1);

        poster.addNewMovie(movie1);
        poster.addNewMovie(movie2);
        poster.addNewMovie(movie3);
        poster.addNewMovie(movie4);
        poster.addNewMovie(movie5);
        poster.addNewMovie(movie6);
        poster.addNewMovie(movie7);
        poster.addNewMovie(movie8);
        poster.addNewMovie(movie9);
        poster.addNewMovie(movie10);
        poster.addNewMovie(movie11);

        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};

        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoreThanIs() {
        PosterManager poster = new PosterManager(20);

        poster.addNewMovie(movie1);
        poster.addNewMovie(movie2);
        poster.addNewMovie(movie3);
        poster.addNewMovie(movie4);
        poster.addNewMovie(movie5);
        poster.addNewMovie(movie6);
        poster.addNewMovie(movie7);
        poster.addNewMovie(movie8);
        poster.addNewMovie(movie9);
        poster.addNewMovie(movie10);
        poster.addNewMovie(movie11);

        Movie[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        Movie[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}