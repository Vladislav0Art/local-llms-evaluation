package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetweenMinus500And500 {

    @Test
    public void estimateTestForYearBetweenMinus500And500() {
        LocalDate date = LocalDate.of(200, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(9604.53616, deltaT, 0.01);
    }

}