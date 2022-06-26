package ru.netology.MoviePoster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoviePosterTest {
    String movie1 = "Бладшот";
    String movie2 = "Вперёд";
    String movie3 = "Отель Белград";
    String movie4 = "Джентельмены";
    String movie5 = "Человек-неведимкка";
    String movie6 = "Троли.Мировой тур";
    String movie7 = "Номер Один";

    @Test
    public void shouldGiveLastMoviesLimit() {
        MoviePoster poster = new MoviePoster(3);
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        poster.add(movie4);
        poster.add(movie5);
        poster.add(movie6);
        poster.add(movie7);
        String[] actual = poster.findLast();
        String[] expected = {movie7, movie6, movie5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limitMoreMovies() {
        MoviePoster poster = new MoviePoster(4);
        poster.add(movie1);
        poster.add(movie2);
        poster.add(movie3);
        String[] actual = poster.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void absenceMoviesInManager() {
        MoviePoster poster = new MoviePoster(4);
        String[] actual = poster.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
}


