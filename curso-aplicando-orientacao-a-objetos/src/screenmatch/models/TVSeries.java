package screenmatch.models;

public class TVSeries extends Title {
    private int seasons;
    private boolean airing;
    private int epsPerSeason;
    private int minPerEp;

    // ----------- GETTERS -----------
    public int getSeasons() {
        return seasons;
    }

    // ----------- SETTERS -----------
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpsPerSeason(int epsPerSeason) {
        this.epsPerSeason = epsPerSeason;
    }

    public void setMinPerEP(int minPerEp) {
        this.minPerEp = minPerEp;
    }

    // ----------- METHODS -----------
    @Override
    public int getDurationMin() {
        return seasons * epsPerSeason * minPerEp;
    }
}
