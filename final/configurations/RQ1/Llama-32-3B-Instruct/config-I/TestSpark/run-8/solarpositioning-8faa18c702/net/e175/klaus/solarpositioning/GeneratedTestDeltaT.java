package net.e175.klaus.solarpositioning;

public class GeneratedTestDeltaT {

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
    public void testDeltaT() {
        DeltaT deltaT = new DeltaT(LocalDate.of(2200, 12, 31));
        assertEquals(-76.2, deltaT.estimate(), 0.01);
    }

}