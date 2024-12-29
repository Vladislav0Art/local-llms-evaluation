package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedEstimateForToday {

    @Test
    public void estimateForToday() {
        LocalDate today = LocalDate.now();
        double result = DeltaT.estimate(today);
        assertNotNull(result);
    }

}