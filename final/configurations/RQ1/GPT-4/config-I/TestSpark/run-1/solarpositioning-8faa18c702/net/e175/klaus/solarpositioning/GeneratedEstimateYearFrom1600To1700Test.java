package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom1600To1700Test {

    @Test
    public void estimateYearFrom1600To1700Test() {
        double result = DeltaT.estimate(LocalDate.of(1650, 3, 18));
        assertEquals(86.344056, result, 0.0001);
    }

}