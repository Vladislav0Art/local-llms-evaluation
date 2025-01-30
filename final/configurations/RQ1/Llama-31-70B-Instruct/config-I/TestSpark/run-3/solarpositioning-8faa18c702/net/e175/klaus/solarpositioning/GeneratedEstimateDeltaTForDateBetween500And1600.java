package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import net.e175.klaus.solarpositioning.DeltaT;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTForDateBetween500And1600 {

    @Test
    public void estimateDeltaTForDateBetween500And1600() {
        LocalDate date = LocalDate.of(1000, 1, 1);
        double expectedDeltaT = 10583.6 - 1014.41 * (date.getYear() / 100) + 33.78311 * Math.pow(date.getYear() / 100, 2)
                - 5.952053 * Math.pow(date.getYear() / 100, 3) - 0.1798452 * Math.pow(date.getYear() / 100, 4)
                + 0.022174192 * Math.pow(date.getYear() / 100, 5) + 0.0090316521 * Math.pow(date.getYear() / 100, 6);
        double actualDeltaT = DeltaT.estimate(date);
        assertEquals(expectedDeltaT, actualDeltaT, 0.00001);
    }

}