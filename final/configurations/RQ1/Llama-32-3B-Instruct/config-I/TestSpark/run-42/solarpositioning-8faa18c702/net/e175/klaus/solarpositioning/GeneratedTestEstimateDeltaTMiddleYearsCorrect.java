package net.e175.klaus.solarpositioning;

public class GeneratedTestEstimateDeltaTMiddleYearsCorrect {

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
    public void testEstimateDeltaTMiddleYearsCorrect() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        double result = DeltaTPublic.estimate(forDate);
        assertEquals(-2.7900000000000005, result, 0.00001);
    }

}