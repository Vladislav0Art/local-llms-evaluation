package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedEstimateAfterLastDayOfYear {

    @Test
    public void estimateAfterLastDayOfYear() {
        LocalDate afterLastDayOfYear = LocalDate.of(2022, 12, 31).plusDays(1);
        double result = DeltaT.estimate(afterLastDayOfYear);
        assertEquals(0.0, result, 1e-9);
    }

}