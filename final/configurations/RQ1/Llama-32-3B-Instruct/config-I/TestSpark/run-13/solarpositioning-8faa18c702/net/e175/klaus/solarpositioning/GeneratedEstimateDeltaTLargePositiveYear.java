package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateDeltaTLargePositiveYear {

    @Test
    public void estimateDeltaTLargePositiveYear() {
        LocalDate date = LocalDate.of(2501, 12, 31);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2) - 0.5628 * (2150 - date.getYear()), deltaT, 0.01);
    }

}