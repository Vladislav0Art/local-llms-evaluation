package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom500To1600Test {

    @Test
    public void estimateYearFrom500To1600Test() {
        double result = DeltaT.estimate(LocalDate.of(1500, 10, 2));
        assertEquals(8582.78238, result, 0.0001);
    }

}