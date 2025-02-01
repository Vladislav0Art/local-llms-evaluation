package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearAfter2150Test {

    @Test
    public void estimateYearAfter2150Test() {
        LocalDate date = LocalDate.of(2200, 12, 10);
        double result = DeltaT.estimate(date);
        assertEquals(244.314493529, result, 0.001);
    }

}