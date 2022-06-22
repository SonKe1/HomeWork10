package ru.netology.MoviePoster;

public class MoviePoster {
    private String[] nameMovies = new String[0];
    private int limit;

    public MoviePoster() {
        limit = 10;
    }

    public MoviePoster(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[nameMovies.length + 1];
        for (int i = 0; i < nameMovies.length; i++) {
            tmp[i] = nameMovies[i];
        }
        tmp[tmp.length - 1] = movie;
        nameMovies = tmp;
    }

    public String[] findAll() {
        return nameMovies;
    }

    public String[] findLast() {

        int resultLength;
        if (nameMovies.length < limit) {
            resultLength = nameMovies.length;
        } else {
            resultLength = limit;
        }
        String[] output = new String[resultLength];
        for (int i = 0; i < output.length; i++) {
            output[i] = nameMovies[nameMovies.length - 1 - i];

        }
        return output;
    }

}

