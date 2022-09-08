package model;

import java.util.Objects;

public class Comment {
    private Film film;
    private User user;
    private String text;

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;
        Comment comment = (Comment) o;
        return Objects.equals(getFilm(), comment.getFilm()) && Objects.equals(getUser(), comment.getUser()) && Objects.equals(getText(), comment.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFilm(), getUser(), getText());
    }

    @Override
    public String toString() {
        return "Comment{" +
                "film=" + film +
                ", user=" + user +
                ", text='" + text + '\'' +
                '}';
    }
}
