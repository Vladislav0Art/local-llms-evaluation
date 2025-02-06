package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateSameMonth SameMonth Test {

    @Test
    public void estimateSameMonth

    SameMonth Test() {
        LocalDate forDate1 = LocalDate.of(2022, 1, 1);
        LocalDate forDate2 = LocalDate.of(2023, 1, 1);
        double result = DeltaT.estimate(forDate1);
        assertEquals(-0.0027259202931020436, result, 0.000001);
    }

}