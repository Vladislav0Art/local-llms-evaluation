package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateDeltaTCenturyWithLeapYear {

    @Test
    public void estimateDeltaTCenturyWithLeapYear() {
        LocalDate date = LocalDate.of(1904, 12, 31);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2), deltaT, 0.01);
    }

}