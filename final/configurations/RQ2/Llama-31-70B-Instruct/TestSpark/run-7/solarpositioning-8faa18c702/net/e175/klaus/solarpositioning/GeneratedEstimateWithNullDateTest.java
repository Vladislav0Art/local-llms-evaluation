package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEstimateWithNullDateTest {

    @Test
    public void estimateWithNullDateTest() {
        LocalDate forDate = null;
        DeltaT deltaT = new DeltaT();
        double expected = 0.0;
        double actual = deltaT.estimate(forDate);
        assertEquals(expected, actual, 0.01);
    }

}