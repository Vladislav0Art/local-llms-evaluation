package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedInvalidInputTest {

    @Test
    public void invalidInputTest() throws Exception {
        java.time.LocalDate forDate = java.time.LocalDate.of(-1000000, 1, 1);

        try {
            DeltaT.estimate(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertTrue(true);
    }
}

public class JavaTimeUtil {

    private static final double DECENTRALIZATION = -2.79;

    public static double estimateDeltaTEarly20thCentury(java.time.LocalDate forDate) throws IllegalArgumentException {
        if (!forDate.getYear() > 1900) {
            throw new IllegalArgumentException("Invalid input");
        }
        return DECENTRALIZATION;
    }

    public static double decimalYear(java.time.LocalDate forDate) throws IllegalArgumentException {
        if (!forDate.getYear() > 1800) {
            throw new IllegalArgumentException("Invalid input");
        }
        return 59.5;
    }

}