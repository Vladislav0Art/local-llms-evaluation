package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedEstimateDeltaTPresentYearTest {

    @Test
    public void estimateDeltaTPresentYearTest() throws Exception {
        java.time.LocalDate forDate = java.time.LocalDate.now();
        double deltaT;
        try {
            deltaT = DeltaT.estimate(forDate);
        } catch (IllegalArgumentException e) {
        }

        assertTrue(-20 <= deltaT && deltaT <= 63.86);
    }

}