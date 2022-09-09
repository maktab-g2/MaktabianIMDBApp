package ir.maktab.service;

import ir.maktab.model.entity.User;
import ir.maktab.repository.UserRepository;
import ir.maktab.service.interfaces.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    UserRepository userRepository = UserRepository.getInstance();

    @Override
    public void addUser(String userName, String password) throws SQLException {
        if (userRepository.isUserNameExist(userName)) {
            User user = new User();
            userRepository.insert(user);
        }
    }

    @Override
    public void findUser() {

    }

    @Override
    public void addFavoriteFilms() {

    }

    @Override
    public void addWatchFilms() {

    }

    @Override
    public void addFavoriteGenre() {

    }

    @Override
    public void watchNewFilm() {

    }
}
