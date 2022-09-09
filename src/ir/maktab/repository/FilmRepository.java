package ir.maktab.repository;

import ir.maktab.model.entity.Comment;
import ir.maktab.model.entity.Film;
import ir.maktab.model.entity.TvSeries;
import ir.maktab.model.entity.User;
import ir.maktab.model.enums.AgeCategory;
import ir.maktab.model.enums.Genre;

import java.sql.*;

public class FilmRepository {
    public boolean insertNewFilm(Film film) throws SQLException {
        Connection connection = ApplicationConstant.getConnection();
        String insertQuery = "INSERT INTO film (\"name\", genre, director_name, created_year, comments, rate," +
                "duration, age_category, country) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement prepareStatement = connection.prepareStatement(insertQuery);
        prepareStatement.setString(1, film.getName());
        prepareStatement.setString(2, String.valueOf(film.getGenre()));
        prepareStatement.setString(3, film.getDirectorName());
        prepareStatement.setDate(4, (Date) film.getCreatedYear());
        prepareStatement.setString(5, film.getComment().getText());
        prepareStatement.setFloat(6, film.getRate());
        prepareStatement.setInt(7, film.getDuration());
        prepareStatement.setString(8, String.valueOf(film.getAgeCategory()));
        prepareStatement.setString(9, film.getCountry());
        prepareStatement.executeUpdate();
        connection.close();
        return true;
    }

    public boolean insertNewTvSeries(TvSeries tvSeries) throws SQLException {
        Connection connection = ApplicationConstant.getConnection();
        String insertQuery = "INSERT INTO film (\"name\", genre, director_name, created_year, comments, rate," +
                "duration, age_category, seasons_number, episods_number, country) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement prepareStatement = connection.prepareStatement(insertQuery);
        prepareStatement.setString(1, tvSeries.getName());
        prepareStatement.setString(2, String.valueOf(tvSeries.getGenre()));
        prepareStatement.setString(3, tvSeries.getDirectorName());
        prepareStatement.setDate(4, (Date) tvSeries.getCreatedYear());
        prepareStatement.setString(5, tvSeries.getComment().getText());
        prepareStatement.setFloat(6, tvSeries.getRate());
        prepareStatement.setInt(7, tvSeries.getDuration());
        prepareStatement.setString(8, String.valueOf(tvSeries.getAgeCategory()));
        prepareStatement.setInt(9, tvSeries.getNumberOfSeasons());
        prepareStatement.setInt(10, tvSeries.getNumberOfEpisode());
        prepareStatement.setString(11, tvSeries.getCountry());
        prepareStatement.executeUpdate();
        connection.close();
        return true;
    }

    public Film selectFilm(String filmName, String directorName) throws SQLException {
        Connection connection = ApplicationConstant.getConnection();
        String selectQuery = "Select * from film where name=? AND director_name=? ";
        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
        preparedStatement.setString(1, filmName);
        preparedStatement.setString(2, directorName);
        ResultSet resultSet = preparedStatement.executeQuery();
        Film film;
        if (resultSet.next()) {
            film = new Film(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    Genre.valueOf(resultSet.getString("genre")),
                    resultSet.getString("director_name"),
                    resultSet.getDate("created_year"),
                    resultSet.getString("country"),
                    resultSet.getFloat("rate"),
                    resultSet.getInt("duration"),
                    AgeCategory.valueOf(resultSet.getString("age_category")));
            return film;
        }
        return null;


    }

    public boolean updateRate(Film film) throws SQLException {
        Connection connection = ApplicationConstant.getConnection();
        String updateRateQuery = "update film set rate = (Select AVG(rate) from user_film where film_id = ?) where id = ?";
        PreparedStatement prepareStatement = connection.prepareStatement(updateRateQuery);
        prepareStatement.setInt(1, film.getId());
        prepareStatement.setInt(2, film.getId());
        int flag = prepareStatement.executeUpdate();
        connection.close();
        return flag > 0;
    }

}
