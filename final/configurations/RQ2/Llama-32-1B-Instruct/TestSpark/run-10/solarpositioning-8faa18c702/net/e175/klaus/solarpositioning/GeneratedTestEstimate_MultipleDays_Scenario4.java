package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestEstimate_MultipleDays_Scenario4 {

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
    public void testEstimate_MultipleDays_Scenario4() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.now().minusDays(30);
        when(deltaT.estimate(any(LoadDate.class))).thenReturn(1.0);
        when(deltaT.estimate(any(LoadDate.class))).thenReturn(2.0);
        double actual = deltaT.estimate(forDate);
        assertNotEquals(1, actual, "Actual estimate is negative.");
    }

}