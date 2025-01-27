package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    private int year;
    private int month;
    private int day;

    public LocalDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "LocalDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

public class SunPositioningService {
    public Optional<Double> getDeltaT(LocalDate forDate) {
        // implementation
        return null;
    }

    public Double getDeltaTForTest(LocalDate forDate) {
        return 1.0;
    }
}

public class DeltaTTest {

    @Mock
    private SunPositioningService sunPositioningService;

}