package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateStartOfYearTest {

    @Test
    public void estimateStartOfYearTest() {
        LocalDate date = LocalDate.of(2021, 1, 1);
        double result = DeltaT.estimate(date);
        double expectedDelta = 70.85; // replace with expected delta t value for this date
        assertEquals(expectedDelta, result, 0.01);
    }

}