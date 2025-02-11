package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTReducedTest {

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
    public void estimateDeltaTReducedTest() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double actual = DeltaT.estimate(forDate);
        assertEquals(62.92 + 0.32217 * (forDate.getYear() - 2000), actual, 0.001);
    }

}