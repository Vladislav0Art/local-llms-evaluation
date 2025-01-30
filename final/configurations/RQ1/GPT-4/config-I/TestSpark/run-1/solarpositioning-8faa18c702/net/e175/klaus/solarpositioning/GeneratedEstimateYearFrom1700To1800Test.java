package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom1700To1800Test {

    @Test
    public void estimateYearFrom1700To1800Test() {
        double result = DeltaT.estimate(LocalDate.of(1750, 4, 16));
        assertEquals(25.93642, result, 0.0001);
    }

}