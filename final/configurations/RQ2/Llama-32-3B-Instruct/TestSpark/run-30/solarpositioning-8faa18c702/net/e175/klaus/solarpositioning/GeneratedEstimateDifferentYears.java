package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEstimateDifferentYears {

    @Test
    public void estimateDifferentYears() {
        LocalDate firstDate = LocalDate.now().minusYears(20);
        LocalDate secondDate = LocalDate.now();
        double result1 = DeltaT.estimate(firstDate);
        double result2 = DeltaT.estimate(secondDate);
        assertTrue(result1 < result2);
    }

}