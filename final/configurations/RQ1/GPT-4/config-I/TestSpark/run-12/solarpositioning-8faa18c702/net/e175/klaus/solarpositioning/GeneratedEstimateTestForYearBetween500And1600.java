package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween500And1600 {

    @Test
    public void estimateTestForYearBetween500And1600() {
        LocalDate date = LocalDate.of(1000, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(472.83768, deltaT, 0.01);
    }

}