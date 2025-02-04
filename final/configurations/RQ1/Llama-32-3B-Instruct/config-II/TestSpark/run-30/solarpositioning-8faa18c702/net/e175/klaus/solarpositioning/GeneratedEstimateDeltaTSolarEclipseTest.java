package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTSolarEclipseTest {

    @Test
    public void estimateDeltaTSolarEclipseTest() {
        LocalDate forDate = LocalDate.of(2012, 5, 20);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -2400 && result <= 700);
    }

}