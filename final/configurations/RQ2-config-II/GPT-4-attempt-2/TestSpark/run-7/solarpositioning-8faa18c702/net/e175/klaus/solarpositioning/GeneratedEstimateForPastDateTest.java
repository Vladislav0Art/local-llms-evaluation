package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateForPastDateTest {

    @Test
    public void estimateForPastDateTest() {
        LocalDate pastDate = LocalDate.of(1800, 1, 1);
        double result = DeltaT.estimate(pastDate);
        assertEquals(13.72, result, 0.001);
    }

}