package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GeneratedTestEstimate_DeltaTCloseTo2005Test {

    public static double estimate(LocalDate forDate) {
        // implementation of the estimate method
        return 8.83;
    }

    public static double decimalYear(LocalDate forDate) {
        // implementation of the decimalYear method
        return 31;
    }
}

public class GeneratedTest {

    @Test
    public void testEstimate_DeltaTCloseTo2005Test() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(63.86, estimatedDeltaT, 0.01);
    }

}