package streamingService;

import java.time.Duration;

public class Movie {
    private String title;
    private String director;
    private Duration duration;
    private Genre genre;
    private Language language;
    private int views;

    public Movie(String title, String director, Duration duration, Genre genre, Language language, int views) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.genre = genre;
        this.language = language;
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getViews() {
        return views;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                ", Director: " + director +
                ", Duration: " + duration +
                ", Genre: " + genre +
                ", Language: " + language +
                ", Views: " + views;
    }
}
