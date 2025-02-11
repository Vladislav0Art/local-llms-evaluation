package net.e175.klaus.solarpositioning;

public class GeneratedTestDecimalYearMiddleYearsCorrect {

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
    public void testDecimalYearMiddleYearsCorrect() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        double result = DeltaTPublic.decimalYear(forDate);
        assertEquals(1900.5, result, 0.00001);
    }

}