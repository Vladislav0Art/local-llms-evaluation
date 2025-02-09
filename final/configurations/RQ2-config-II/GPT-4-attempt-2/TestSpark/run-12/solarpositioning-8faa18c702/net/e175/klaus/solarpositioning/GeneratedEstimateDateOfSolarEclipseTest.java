package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDateOfSolarEclipseTest {

    private static final double DELTA = 0.001;

    @Test
    public void estimateDateOfSolarEclipseTest() {
        LocalDate date = LocalDate.of(2017, 8, 21);  // Date of solar eclipse
        double expected = 68.8033; // Estimated delta T for this date
        assertEquals(expected, DeltaT.estimate(date), DELTA);
    }

}