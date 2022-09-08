package model;

import java.util.Objects;

public class TvSeries extends Film{
    private int numberOfSeasons;
    private int numberOfEpisode;

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfEpisode() {
        return numberOfEpisode;
    }

    public void setNumberOfEpisode(int numberOfEpisode) {
        this.numberOfEpisode = numberOfEpisode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TvSeries)) return false;
        TvSeries tvSeries = (TvSeries) o;
        return getNumberOfSeasons() == tvSeries.getNumberOfSeasons() && getNumberOfEpisode() == tvSeries.getNumberOfEpisode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfSeasons(), getNumberOfEpisode());
    }

    @Override
    public String toString() {
        return "TvSeries{" +
                "numberOfSeasons=" + numberOfSeasons +
                ", numberOfEpisode=" + numberOfEpisode +
                '}';
    }
}
