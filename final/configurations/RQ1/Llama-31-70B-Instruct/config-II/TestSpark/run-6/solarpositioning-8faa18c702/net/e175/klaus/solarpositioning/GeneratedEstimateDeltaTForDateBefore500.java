package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import net.e175.klaus.solarpositioning.DeltaT;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTForDateBefore500 {

    @Test
    public void estimateDeltaTForDateBefore500() {
        LocalDate date = LocalDate.of(499, 1, 1);
        double expectedDeltaT = -20 + 32 * Math.pow((date.getYear() - 1820) / 100, 2);
        double actualDeltaT = DeltaT.estimate(date);
        assertEquals(expectedDeltaT, actualDeltaT, 0.00001);
    }

}