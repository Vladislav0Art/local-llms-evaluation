package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween1900And1920 {

    @Test
    public void estimateTestForYearBetween1900And1920() {
        LocalDate date = LocalDate.of(1910, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(13.1079, deltaT, 0.01);
    }

}