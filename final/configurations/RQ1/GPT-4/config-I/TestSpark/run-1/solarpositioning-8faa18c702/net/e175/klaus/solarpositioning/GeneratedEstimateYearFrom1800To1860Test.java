package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom1800To1860Test {

    @Test
    public void estimateYearFrom1800To1860Test() {
        double result = DeltaT.estimate(LocalDate.of(1850, 6, 12));
        assertEquals(14.324267, result, 0.0001);
    }

}