package ir.maktab.service;

import ir.maktab.service.interfaces.FilmService;

public class FilmServiceImpl implements FilmService {
    private static FilmServiceImpl filmService;

    private FilmServiceImpl() {
    }

    public static FilmServiceImpl getInstance() {
        if (filmService == null) {
            filmService = new FilmServiceImpl();
        }
        return filmService;
    }

    @Override
    public void addFilm() {

    }

    @Override
    public void deleteFilm() {

    }
}
