package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEstimateWithValidDateTest {

    @Test
    public void estimateWithValidDateTest() {
        LocalDate forDate = LocalDate.of(2020, 1, 1);
        DeltaT deltaT = new DeltaT();
        double expected = 69.34;
        double actual = deltaT.estimate(forDate);
        assertEquals(expected, actual, 0.01);
    }

}