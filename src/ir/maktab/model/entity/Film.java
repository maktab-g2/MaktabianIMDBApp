package ir.maktab.model.entity;

import ir.maktab.model.enums.AgeCategory;
import ir.maktab.model.enums.Genre;

import java.util.Date;
import java.util.Objects;

public class Film {
    private int id;
    private String name;
    private Genre genre;
    private String directorName;
    private Date createdYear;
    private String country;
    private Comment comment;
    private float rate;
    private int duration;
    private AgeCategory ageCategory;

    public Film() {
    }

    public Film(int id, String name, Genre genre, String directorName, Date createdYear, String country, float rate, int duration, AgeCategory ageCategory) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.directorName = directorName;
        this.createdYear = createdYear;
        this.country = country;
        this.rate = rate;
        this.duration = duration;
        this.ageCategory = ageCategory;
    }

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

    public float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;
        Film film = (Film) o;
        return getId() == film.getId() && getRate() == film.getRate() && getDuration() == film.getDuration() && Objects.equals(getName(), film.getName()) && getGenre() == film.getGenre() && Objects.equals(getDirectorName(), film.getDirectorName()) && Objects.equals(getCreatedYear(), film.getCreatedYear()) && Objects.equals(getCountry(), film.getCountry()) && Objects.equals(getComment(), film.getComment()) && getAgeCategory() == film.getAgeCategory();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getGenre(), getDirectorName(), getCreatedYear(), getCountry(), getComment(), getRate(), getDuration(), getAgeCategory());
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
