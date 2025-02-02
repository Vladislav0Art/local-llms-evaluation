package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateDeltaTFixedDateInThePast {

    @Test
    public void estimateDeltaTFixedDateInThePast() {
        LocalDate date = LocalDate.of(1800, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2), deltaT, 0.01);
    }

}