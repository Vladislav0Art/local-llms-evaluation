package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedEstimateForTomorrow {

    @Test
    public void estimateForTomorrow() {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        double result = DeltaT.estimate(tomorrow);
        assertNotNull(result);
    }

}