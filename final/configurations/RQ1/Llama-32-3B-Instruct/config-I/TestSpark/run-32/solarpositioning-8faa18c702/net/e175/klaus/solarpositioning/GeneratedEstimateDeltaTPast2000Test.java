package net.e175.klaus.solarpositioning;

public class GeneratedEstimateDeltaTPast2000Test {

    public static double estimate(LocalDate forDate) throws IllegalArgumentException {
        // implementation
    }

    public static double decimalYear(LocalDate forDate) throws IllegalArgumentException {
        // implementation
    }
}

public class GeneratedTest {

    @Test
    public void estimateDeltaTPast2000Test() throws Exception {
        LocalDate forDate = LocalDate.of(-100, 1, 1);
        try {
            DeltaT.estimate(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertEquals(-20, -20, 1e-6);
    }

}