package ir.maktab.model.entity;

import ir.maktab.model.enums.Genre;

import java.util.List;
import java.util.Objects;

public class User {
    private String userName;
    private String password;
    private int age;
    private String mobileNumber;
    private String email;
    private List<Film> favouriteFilm;
    private List<Film> watchedFilms;
    private List<Genre> favouriteGenre;

    public User() {
    }

    public User(String userName, String password, int age, String mobileNumber, String email, List<Film> favouriteFilm, List<Film> watchedFilms, List<Genre> favouriteGenre) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.favouriteFilm = favouriteFilm;
        this.watchedFilms = watchedFilms;
        this.favouriteGenre = favouriteGenre;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Film> getFavouriteFilm() {
        return favouriteFilm;
    }

    public void setFavouriteFilm(List<Film> favouriteFilm) {
        this.favouriteFilm = favouriteFilm;
    }

    public List<Film> getWatchedFilms() {
        return watchedFilms;
    }

    public void setWatchedFilms(List<Film> watchedFilms) {
        this.watchedFilms = watchedFilms;
    }

    public List<Genre> getFavouriteGenre() {
        return favouriteGenre;
    }

    public void setFavouriteGenre(List<Genre> favouriteGenre) {
        this.favouriteGenre = favouriteGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(userName, user.userName) && Objects.equals(password, user.password) && Objects.equals(mobileNumber, user.mobileNumber) && Objects.equals(email, user.email) && Objects.equals(favouriteFilm, user.favouriteFilm) && Objects.equals(watchedFilms, user.watchedFilms) && Objects.equals(favouriteGenre, user.favouriteGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, age, mobileNumber, email, favouriteFilm, watchedFilms, favouriteGenre);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", favouriteFilm=" + favouriteFilm +
                ", watchedFilms=" + watchedFilms +
                ", favouriteGenre=" + favouriteGenre +
                '}';
    }
}

