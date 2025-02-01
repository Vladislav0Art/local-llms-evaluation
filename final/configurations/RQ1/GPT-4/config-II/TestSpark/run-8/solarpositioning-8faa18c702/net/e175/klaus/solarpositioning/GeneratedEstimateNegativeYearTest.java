package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateNegativeYearTest {

    @Test
    public void estimateNegativeYearTest() {
        LocalDate date = LocalDate.of(-1000, 01, 01);
        double result = DeltaT.estimate(date);
        assertEquals(280.0, result, 0.001);
    }

}