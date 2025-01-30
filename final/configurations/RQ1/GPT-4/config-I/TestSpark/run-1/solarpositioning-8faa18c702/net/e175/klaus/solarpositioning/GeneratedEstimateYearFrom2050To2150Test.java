package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom2050To2150Test {

    @Test
    public void estimateYearFrom2050To2150Test() {
        double result = DeltaT.estimate(LocalDate.of(2100, 1, 13));
        assertEquals(98.6902, result, 0.0001);
    }

}