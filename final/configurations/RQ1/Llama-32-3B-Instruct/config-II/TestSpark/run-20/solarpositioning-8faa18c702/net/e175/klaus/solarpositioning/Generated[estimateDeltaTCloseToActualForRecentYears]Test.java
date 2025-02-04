package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.mockito.Mockito;

public class Generated[estimateDeltaTCloseToActualForRecentYears]

Test {

    @Test
    public void [estimateDeltaTCloseToActualForRecentYears]Test() {
        LocalDate forDate = LocalDate.of(2020, 12, 31);
        double actualDeltaT = calculateActualDeltaT(forDate);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(actualDeltaT, deltaT, 1e-6);
    }

}