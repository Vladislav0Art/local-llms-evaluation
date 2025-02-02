package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTEarlyYearsAfter2100 {

    @Test
    public void estimateDeltaTEarlyYearsAfter2100() {
        LocalDate forDate = new LocalDate(2200, 12, 31);
        DeltaT deltaT = new DeltaTCenturiesAfter2005(forDate);
        assertEquals(-76.2, deltaT.estimate(), 0.01);
    }
}

public class LocalDate {
    private int year;

    public LocalDate(int year) {
        this.year = year;
    }

    public double estimate() {
        // Your implementation
        return year - 2000.0;
    }
}

public class DeltaTCenturiesAfter2005 extends DeltaT {
    private LocalDate date;

    public DeltaTCenturiesAfter2005(LocalDate date) {
        this.date = date;
    }

    @Override
    public double estimate() {
        return super.estimate(date.year - 2005);
    }

}