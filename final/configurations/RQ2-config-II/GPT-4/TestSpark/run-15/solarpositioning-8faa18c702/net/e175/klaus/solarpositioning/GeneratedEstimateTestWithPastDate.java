package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestWithPastDate {

    @Test
    public void estimateTestWithPastDate() {
        LocalDate pastDate = LocalDate.of(1950, 1, 1);
        double deltaT = DeltaT.estimate(pastDate);
        assertEquals(29.07, deltaT, 0.01);
    }

}