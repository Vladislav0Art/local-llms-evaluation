package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearFrom1860To1900Test {

    @Test
    public void estimateYearFrom1860To1900Test() {
        double result = DeltaT.estimate(LocalDate.of(1880, 2, 3));
        assertEquals(8.681876, result, 0.0001);
    }

}