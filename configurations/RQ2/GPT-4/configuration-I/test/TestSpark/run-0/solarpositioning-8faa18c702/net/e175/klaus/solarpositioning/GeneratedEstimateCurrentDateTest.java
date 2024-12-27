package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateCurrentDateTest {

    @Test
    public void estimateCurrentDateTest() {
        LocalDate currentDate = LocalDate.now();
        double deltaT = DeltaT.estimate(currentDate);

        // check if deltaT is calculated and not a NaN
        assertFalse(Double.isNaN(deltaT));
    }

}