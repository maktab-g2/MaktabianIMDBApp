package ir.maktab.service.interfaces;

import java.sql.SQLException;

public interface UserService {
    void addUser(String userName, String password) throws SQLException;

    void findUser();

    void addFavoriteFilms();

    void addWatchFilms();

    void addFavoriteGenre();

    void watchNewFilm();
}
