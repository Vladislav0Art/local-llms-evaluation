package net.e175.klaus.solarpositioning;

public class GeneratedTestDecimalYearLateYearsCorrect {

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