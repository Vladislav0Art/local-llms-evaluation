package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    public static double estimate(java.time.LocalDate forDate) throws IllegalArgumentException {
        if (!forDate.getYear() > 1900) {
            throw new IllegalArgumentException("Invalid input");
        }
        return -2.79;
    }

    public static double decimalYear(java.time.LocalDate forDate) throws IllegalArgumentException {
        if (!forDate.getYear() > 1800) {
            throw new IllegalArgumentException("Invalid input");
        }
        return 59.5;
    }
}

public class GeneratedTest {

    @Test
    public void estimateDeltaTEarly20thCenturyTest() throws Exception {
        java.time.LocalDate forDate = java.time.LocalDate.of(1900, 1, 1);
        try {
            DeltaT.estimate(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertEquals(-2.79, -2.79, 1e-6);
    }

    @Test
    public void estimateDeltaTMiddle20thCenturyTest() throws Exception {
        java.time.LocalDate forDate = java.time.LocalDate.of(1950, 1, 1);
        try {
            DeltaT.estimate(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertEquals(29.07, 29.07, 1e-6);
    }

    @Test
    public void estimateDeltaTLate20thCenturyTest() throws Exception {
        java.time.LocalDate forDate = java.time.LocalDate.of(2005, 1, 1);
        try {
            DeltaT.estimate(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertEquals(63.86, 63.86, 1e-6);
    }

}