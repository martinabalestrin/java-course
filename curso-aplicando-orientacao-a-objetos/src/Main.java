import screenmatch.models.Title;
import screenmatch.models.Film;
import screenmatch.models.TVSeries;

public class Main {
    public static void main(String[] args) {

        Film myFilm = new Film();
        myFilm.setName("O poderoso chefão");
        myFilm.setYearRelease(1970);
        myFilm.setDurationMin(180);

        myFilm.addReview(7.5);
        myFilm.addReview(5.2);
        myFilm.addReview(9.3);

        myFilm.printInfo();

        TVSeries mySerie = new TVSeries();
        mySerie.setName("The Flash");
        mySerie.setSeasons(6);
        mySerie.setEpsPerSeason(21);
        mySerie.setMinPerEP(42);

        System.out.println("Duração para maratonar 'The Flash': " + mySerie.getDurationMin());
    }
}
