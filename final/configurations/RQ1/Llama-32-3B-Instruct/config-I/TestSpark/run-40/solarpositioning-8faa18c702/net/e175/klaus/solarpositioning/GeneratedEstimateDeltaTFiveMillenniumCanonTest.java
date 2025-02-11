package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTFiveMillenniumCanonTest {

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
    public void estimateDeltaTFiveMillenniumCanonTest() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        double actual = DeltaT.estimate(forDate);
        assertEquals(-20 + 32 * Math.pow(((double) (forDate.getYear() - 1820)) / 100), actual, 0.001);
    }

}