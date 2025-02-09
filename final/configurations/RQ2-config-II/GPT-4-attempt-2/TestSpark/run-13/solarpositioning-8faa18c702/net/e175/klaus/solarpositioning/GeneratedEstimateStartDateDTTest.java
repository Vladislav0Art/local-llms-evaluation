package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateStartDateDTTest {

    @Test
    public void estimateStartDateDTTest() {
        // This date is assumed to be the start of Delta T calculations
        LocalDate date = LocalDate.of(1620, Month.JANUARY, 1);
        double result = DeltaT.estimate(date);

        // Expected result is based on historical DeltaT value for the year 1620
        double expected = -20;
        double delta = 0.1;

        assertEquals(expected, result, delta);
    }

}