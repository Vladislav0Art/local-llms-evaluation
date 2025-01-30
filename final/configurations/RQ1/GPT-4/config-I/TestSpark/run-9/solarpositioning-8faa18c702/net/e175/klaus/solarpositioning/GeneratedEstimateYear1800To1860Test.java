package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear1800To1860Test {

    @Test
    public void estimateYear1800To1860Test() {
        LocalDate date = LocalDate.of(1850, 5, 1);
        assertEquals(7.083831082321417, DeltaT.estimate(date), 0.1);
    }

}