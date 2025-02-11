package net.e175.klaus.solarpositioning;

public class GeneratedTestEstimateDeltaTLateYearsCorrect {

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
    public void testEstimateDeltaTLateYearsCorrect() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double result = DeltaTPublic.estimate(forDate);
        assertEquals(63.86000000000001, result, 0.00001);
    }

}