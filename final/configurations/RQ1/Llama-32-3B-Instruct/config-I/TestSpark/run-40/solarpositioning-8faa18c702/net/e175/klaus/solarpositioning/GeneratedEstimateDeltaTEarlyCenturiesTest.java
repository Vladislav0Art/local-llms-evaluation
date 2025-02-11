package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTEarlyCenturiesTest {

    public static double estimate(LocalDate forDate) {
        if (forDate.getYear() < 1820) {
            return -20 + 32 * Math.pow((double) (forDate.getYear() - 1820) / 100, 2);
        } else {
            return -20 + 32 * Math.pow(((double) (forDate.getYear() - 1820)) / 100, 2);
        }
    }
}

public class GeneratedTest {

    @Test
    public void estimateDeltaTEarlyCenturiesTest() {
        LocalDate forDate = LocalDate.of(1500, 1, 1);
        double actual = DeltaT.estimate(forDate);
        assertEquals(-20 + 32 * Math.pow((double) (forDate.getYear() - 1820) / 100, 2), actual, 0.001);
    }

}