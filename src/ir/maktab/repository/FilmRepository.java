package ir.maktab.repository;

import ir.maktab.model.entity.Film;
import ir.maktab.model.entity.TvSeries;
import ir.maktab.model.entity.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
        prepareStatement.setInt(6, film.getRate());
        prepareStatement.setInt(7, film.getDuration());
        prepareStatement.setString(8, String.valueOf(film.getAgeCategory()));
        prepareStatement.setString(9 film.getCountry());
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
        prepareStatement.setInt(6, tvSeries.getRate());
        prepareStatement.setInt(7, tvSeries.getDuration());
        prepareStatement.setString(8, String.valueOf(tvSeries.getAgeCategory()));
        prepareStatement.setInt(9, tvSeries.getNumberOfSeasons());
        prepareStatement.setInt(10, tvSeries.getNumberOfEpisode());
        prepareStatement.setString(11, tvSeries.getCountry());
        prepareStatement.executeUpdate();
        connection.close();
        return true;
    }

}
