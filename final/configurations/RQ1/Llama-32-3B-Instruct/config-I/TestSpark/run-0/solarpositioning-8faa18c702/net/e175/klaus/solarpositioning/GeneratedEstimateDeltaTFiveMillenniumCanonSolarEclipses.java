package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTFiveMillenniumCanonSolarEclipses {

    @Test
    public void estimateDeltaTFiveMillenniumCanonSolarEclipses() {
        LocalDate date = LocalDate.of(1999, 12, 10);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow((date.getYear() - 1820) / 100, 2), deltaT, 0.01);
    }

}