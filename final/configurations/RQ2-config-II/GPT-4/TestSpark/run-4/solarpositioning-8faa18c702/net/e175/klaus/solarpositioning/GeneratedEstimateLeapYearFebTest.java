package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateLeapYearFebTest {

    @Test
    public void estimateLeapYearFebTest() {
        LocalDate date = LocalDate.of(2020, 2, 29); // Leap year February 29
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

}