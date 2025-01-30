package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFromNegative500To500Test {

    @Test
    public void estimateYearFromNegative500To500Test() {
        double result = DeltaT.estimate(LocalDate.of(0, 7, 24));
        assertEquals(2825.27151, result, 0.0001);
    }

}