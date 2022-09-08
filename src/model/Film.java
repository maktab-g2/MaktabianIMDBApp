package model;

import model.enums.AgeCategory;
import model.enums.Genre;

import java.sql.Time;
import java.util.Date;

public class Film {
    private int id;
    private String name;
    private Genre genre;
    private String directorName;
    private Date createdYear;
    private String country;
    private Comment comment;
    private int rate;
    private int duration;
    private AgeCategory ageCategory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public Date getCreatedYear() {
        return createdYear;
    }

    public void setCreatedYear(Date createdYear) {
        this.createdYear = createdYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", directorName='" + directorName + '\'' +
                ", createdYear=" + createdYear +
                ", country='" + country + '\'' +
                ", comment=" + comment +
                ", rate=" + rate +
                ", duration=" + duration +
                ", ageCategory=" + ageCategory +
                '}';
    }
}
