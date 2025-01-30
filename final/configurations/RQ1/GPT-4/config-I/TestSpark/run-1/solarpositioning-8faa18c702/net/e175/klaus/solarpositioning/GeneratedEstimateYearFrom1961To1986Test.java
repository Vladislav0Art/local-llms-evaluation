package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom1961To1986Test {

    @Test
    public void estimateYearFrom1961To1986Test() {
        double result = DeltaT.estimate(LocalDate.of(1970, 11, 30));
        assertEquals(51.70725, result, 0.0001);
    }

}