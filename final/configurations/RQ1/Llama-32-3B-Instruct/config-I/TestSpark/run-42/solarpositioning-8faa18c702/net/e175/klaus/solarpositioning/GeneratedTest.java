package net.e175.klaus.solarpositioning;

public class GeneratedTest {

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

    @Test
    public void testEstimateDeltaTMiddleYearsCorrect() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        double result = DeltaTPublic.estimate(forDate);
        assertEquals(-2.7900000000000005, result, 0.00001);
    }

    @Test
    public void testEstimateDeltaTLateYearsCorrect() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double result = DeltaTPublic.estimate(forDate);
        assertEquals(63.86000000000001, result, 0.00001);
    }

    @Test
    public void testDecimalYearEarlyYearsCorrect() {
        LocalDate forDate = LocalDate.of(1820, 1, 1);
        double result = DeltaTPublic.decimalYear(forDate);
        assertEquals(1820.5, result, 0.00001);
    }

    @Test
    public void testDecimalYearMiddleYearsCorrect() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        double result = DeltaTPublic.decimalYear(forDate);
        assertEquals(1900.5, result, 0.00001);
    }

    @Test
    public void testDecimalYearLateYearsCorrect() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double result = DeltaTPublic.decimalYear(forDate);
        assertEquals(2000.5, result, 0.00001);
    }
}

public class TestRunner {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("net.e175.klaus.solarpositioning.GeneratedTest");
    }

}