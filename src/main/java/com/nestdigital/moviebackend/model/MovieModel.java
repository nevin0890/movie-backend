package com.nestdigital.moviebackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "movies")
@Entity
public class MovieModel {

    @Id
    @GeneratedValue
    private int  id;
    private String  moviename;
    private int  releaseyear;
    private String  language;

    public MovieModel() {
    }

    public MovieModel(int id, String moviename, int releaseyear, String language) {
        this.id = id;
        this.moviename = moviename;
        this.releaseyear = releaseyear;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
