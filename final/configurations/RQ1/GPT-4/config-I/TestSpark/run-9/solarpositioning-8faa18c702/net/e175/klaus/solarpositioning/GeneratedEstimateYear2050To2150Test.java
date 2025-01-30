package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear2050To2150Test {

    @Test
    public void estimateYear2050To2150Test() {
        LocalDate date = LocalDate.of(2100, 5, 1);
        assertEquals(182.21027851063833, DeltaT.estimate(date), 0.1);
    }

}