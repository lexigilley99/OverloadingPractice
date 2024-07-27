package org.example;

public class TvShow {
    private final String name;
    private final int episodes;
    private final String genre;

    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public TvShow(String name, int episodes) {
        this(name, episodes, "Unknown"); // default genre to "Unknown"
    }

    public TvShow(String name) {
        this(name, 0, "Unknown"); // default episodes to 0 and genre to "Unknown"
    }

    public TvShow() {
        this("Unknown", 0, "Unknown"); // default name to "Unknown", episodes to 0, and genre to "Unknown"
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for episodes
    public int getEpisodes() {
        return episodes;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + name + " with " + episodes + " number of episodes. The genre is " + genre;
    }
}
