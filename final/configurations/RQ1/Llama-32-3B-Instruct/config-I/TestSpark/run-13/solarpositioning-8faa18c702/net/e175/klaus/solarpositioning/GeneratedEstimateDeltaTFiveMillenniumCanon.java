package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateDeltaTFiveMillenniumCanon {

    @Test
    public void estimateDeltaTFiveMillenniumCanon() {
        LocalDate date = LocalDate.of(1850, 6, 30);
        double deltaT = DeltaT.estimate(date);
        assertEquals(13.72, deltaT, 0.01);
    }

}