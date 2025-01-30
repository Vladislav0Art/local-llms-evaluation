package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom1986To2005Test {

    @Test
    public void estimateYearFrom1986To2005Test() {
        double result = DeltaT.estimate(LocalDate.of(1990, 8, 4));
        assertEquals(67.214725, result, 0.0001);
    }

}