package net.e175.klaus.solarpositioning;

public class GeneratedTestEstimateDeltaTEarlyYearsCorrect {

    public static double estimate(LocalDate forDate) {
        // implementation here
        return 0;
    }

    public static double decimalYear(LocalDate forDate) {
        // implementation here
        return 0;
    }
}

public class GeneratedTest {

    @Test
    public void testEstimateDeltaTEarlyYearsCorrect() {
        LocalDate forDate = LocalDate.of(1820, 1, 1);
        double result = DeltaTPublic.estimate(forDate);
        assertEquals(-20.0, result, 0.00001);
    }

}