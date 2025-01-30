package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearLessThanNegative500Test {

    @Test
    public void estimateYearLessThanNegative500Test() {
        double result = DeltaT.estimate(LocalDate.of(-501, 5, 4));
        assertEquals(31396.5625, result, 0.0001);
    }

}