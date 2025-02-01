package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1700Test {

    @Test
    public void estimateYearBefore1700Test() {
        LocalDate date = LocalDate.of(1650, 5, 21);
        double result = DeltaT.estimate(date);
        assertEquals(133.40977564, result, 0.001);
    }

}