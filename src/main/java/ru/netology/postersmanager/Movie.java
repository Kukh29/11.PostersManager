package ru.netology.postersmanager;


public class Movie {
    private int id;
    private String name;
    private String genre;

    public Movie() {                    // констуктор no args
    }

    public Movie(int id, String name, String genre) {   // констуктор all args
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {     // получаем
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(int id) {     // устанавливаем
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }
}