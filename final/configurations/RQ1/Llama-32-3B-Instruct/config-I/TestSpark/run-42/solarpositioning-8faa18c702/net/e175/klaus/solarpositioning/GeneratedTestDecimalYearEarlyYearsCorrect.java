package net.e175.klaus.solarpositioning;

public class GeneratedTestDecimalYearEarlyYearsCorrect {

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
    public void testDecimalYearEarlyYearsCorrect() {
        LocalDate forDate = LocalDate.of(1820, 1, 1);
        double result = DeltaTPublic.decimalYear(forDate);
        assertEquals(1820.5, result, 0.00001);
    }

}