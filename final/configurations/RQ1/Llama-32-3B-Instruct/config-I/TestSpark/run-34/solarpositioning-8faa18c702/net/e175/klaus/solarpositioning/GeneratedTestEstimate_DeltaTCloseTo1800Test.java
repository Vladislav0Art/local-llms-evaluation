package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GeneratedTestEstimate_DeltaTCloseTo1800Test {

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
    public void testEstimate_DeltaTCloseTo1800Test() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(8.83, estimatedDeltaT, 0.01);
    }

}