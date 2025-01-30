package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear1986To2005Test {

    @Test
    public void estimateYear1986To2005Test() {
        LocalDate date = LocalDate.of(1995, 5, 1);
        assertEquals(72.72678149385337, DeltaT.estimate(date), 0.1);
    }

}