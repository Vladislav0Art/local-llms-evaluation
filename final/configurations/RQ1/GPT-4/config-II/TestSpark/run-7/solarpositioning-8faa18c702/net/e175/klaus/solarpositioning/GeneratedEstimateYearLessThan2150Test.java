package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan2150Test {

    private static final double MAX_ERROR = 0.0001;

    @Test
    public void estimateYearLessThan2150Test() {
        double result = DeltaT.estimate(LocalDate.of(2149, 1, 1));
        assertEquals(result, -5.12528, MAX_ERROR);
    }

}