package ir.maktab.service.interfaces;

import ir.maktab.model.entity.User;

import java.sql.SQLException;

public interface UserService {
    void addUser(User user) throws SQLException;

    void findUser();

    void addFavoriteFilms();

    void addWatchFilms();

    void addFavoriteGenre();

    void watchNewFilm();
}
