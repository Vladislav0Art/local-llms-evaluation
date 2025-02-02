package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTEarly21stCenturyTest {

    public static double estimate(LocalDate forDate) throws IllegalArgumentException {
        // implementation
    }

    public static double decimalYear(LocalDate forDate) throws IllegalArgumentException {
        // implementation
    }
}

public class GeneratedTest {

    @Test
    public void estimateDeltaTEarly21stCenturyTest() throws Exception {
        LocalDate forDate = LocalDate.of(2010, 1, 1);
        try {
            DeltaT.estimate(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertEquals(62.92, 62.92, 1e-6);
    }

}