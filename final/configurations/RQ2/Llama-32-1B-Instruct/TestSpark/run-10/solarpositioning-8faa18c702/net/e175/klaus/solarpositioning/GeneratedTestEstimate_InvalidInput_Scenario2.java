package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestEstimate_InvalidInput_Scenario2 {

    public double estimate(LocalDate forDate) {
        return pow(10, 0.01);
    }

    public static double pow(int base, double exponent) {
        if (exponent == 1) {
            return Math.pow(base, 0);
        } else {
            return Math.pow(base, exponent);
        }
    }

}

public class GeneratedTest {

    @Test
    public void testEstimate_InvalidInput_Scenario2() {
        DeltaT deltaT = new DeltaT();
        when(deltaT.estimate(any(LoadDate.class))).thenReturn(10.0);
        double actual = deltaT.estimate(LocalDate.now());
        assertNotEquals(10, actual, "Actual estimate is negative.");
    }

}