package ir.maktab.service;

import ir.maktab.model.entity.User;
import ir.maktab.repository.UserRepository;
import ir.maktab.service.interfaces.UserService;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserServiceImpl implements UserService {
    private static UserServiceImpl userService;

    private UserServiceImpl() {
    }

    public static UserServiceImpl getInstance() {
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        return userService;
    }

    UserRepository userRepository = UserRepository.getInstance();

    @Override
    public void addUser(User user) throws SQLException {
        userRepository.insert(user);
    }
    public boolean validPassword(String password){
       return password.length()<8;
    }
    public boolean validEmail(String email){
        Pattern pattern=Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher= pattern.matcher(email);
        return matcher.find();

    }
    public boolean isExistUser(String userName) throws SQLException {
       return userRepository.isUserNameExist(userName);
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
