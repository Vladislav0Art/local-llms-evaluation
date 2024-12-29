package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedEstimateIsNegativeWhenBeforeEquinox {

    @Test
    public void estimateIsNegativeWhenBeforeEquinox() {
        LocalDate beforeEquinox = LocalDate.of(2022, 12, 15);
        double result = DeltaT.estimate(beforeEquinox);
        assertTrue(result < 0);
    }

}