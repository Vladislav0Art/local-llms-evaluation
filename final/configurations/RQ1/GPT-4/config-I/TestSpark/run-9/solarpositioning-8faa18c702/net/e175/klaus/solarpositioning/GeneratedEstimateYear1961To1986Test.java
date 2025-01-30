package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear1961To1986Test {

    @Test
    public void estimateYear1961To1986Test() {
        LocalDate date = LocalDate.of(1970, 5, 1);
        assertEquals(46.92288704147465, DeltaT.estimate(date), 0.1);
    }

}