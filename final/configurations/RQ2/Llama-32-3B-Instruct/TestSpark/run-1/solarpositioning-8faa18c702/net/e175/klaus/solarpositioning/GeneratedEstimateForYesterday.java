package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedEstimateForYesterday {

    @Test
    public void estimateForYesterday() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        double result = DeltaT.estimate(yesterday);
        assertNotNull(result);
    }

}