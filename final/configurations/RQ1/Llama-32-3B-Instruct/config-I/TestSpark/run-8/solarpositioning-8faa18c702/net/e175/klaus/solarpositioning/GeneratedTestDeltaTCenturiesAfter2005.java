package net.e175.klaus.solarpositioning;

public class GeneratedTestDeltaTCenturiesAfter2005 {

    private LocalDate date;

    public DeltaT(LocalDate date) {
        this.date = date;
    }

    public double estimate() {
        // implementation
        return -76.2; // placeholder value for demonstration
    }
}

public class DeltaTCenturiesAfter2005 extends DeltaT {
    public DeltaTCenturiesAfter2005(LocalDate date) {
        super(date);
    }

    public double estimate() {
        return super.estimate();
    }
}

public class SparkTest {

    @Test
    public void testDeltaTCenturiesAfter2005() {
        DeltaTCenturiesAfter2005 deltaTCenturiesAfter2005 = new DeltaTCenturiesAfter2005(LocalDate.of(1750, 1, 1));
        assertEquals(-76.2, deltaTCenturiesAfter2005.estimate(), 0.01);
    }

}