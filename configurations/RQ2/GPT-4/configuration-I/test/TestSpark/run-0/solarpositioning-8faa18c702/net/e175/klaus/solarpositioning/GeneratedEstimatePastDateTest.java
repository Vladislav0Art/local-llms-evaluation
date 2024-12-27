package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1955, 1, 1);
        double deltaT = DeltaT.estimate(pastDate);

        // check if deltaT is calculated and not a NaN
        assertFalse(Double.isNaN(deltaT));
    }

}