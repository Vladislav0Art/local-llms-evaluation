package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateEndOfYearTest {

    @Test
    public void estimateEndOfYearTest() {
        LocalDate date = LocalDate.of(2021, 12, 31);
        double result = DeltaT.estimate(date);
        double expectedDelta = 72.01; // replace with expected delta t value for this date
        assertEquals(expectedDelta, result, 0.01);
    }

}