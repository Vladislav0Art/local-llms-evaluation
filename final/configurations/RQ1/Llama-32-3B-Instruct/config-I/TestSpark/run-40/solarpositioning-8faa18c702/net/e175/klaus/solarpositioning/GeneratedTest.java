package net.e175.klaus.solarpositioning;

public class GeneratedTest {

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

    @Test
    public void estimateDeltaTFiveMillenniumCanonTest() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        double actual = DeltaT.estimate(forDate);
        assertEquals(-20 + 32 * Math.pow(((double) (forDate.getYear() - 1820)) / 100), actual, 0.001);
    }

    @Test
    public void estimateDeltaTReducedTest() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double actual = DeltaT.estimate(forDate);
        assertEquals(62.92 + 0.32217 * (forDate.getYear() - 2000), actual, 0.001);
    }

    @Test
    public void estimateDeltaTWithDifferentMonthsTest() {
        LocalDate forDate1 = LocalDate.of(2022, 12, 31);
        double actual1 = DeltaT.estimate(forDate1);
        assertEquals(-20 + 32 * Math.pow((double) (forDate1.getYear() - 1820) / 100, 2), actual1, 0.001);

        LocalDate forDate2 = LocalDate.of(2023, 1, 31);
        double actual2 = DeltaT.estimate(forDate2);
        assertEquals(-20 + 32 * Math.pow(((double) (forDate2.getYear() - 1820)) / 100, 2), actual2, 0.001);
    }

}