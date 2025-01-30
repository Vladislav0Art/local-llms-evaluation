package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear1941To1961Test {

    @Test
    public void estimateYear1941To1961Test() {
        LocalDate date = LocalDate.of(1955, 5, 1);
        assertEquals(36.028546382978726, DeltaT.estimate(date), 0.1);
    }

}