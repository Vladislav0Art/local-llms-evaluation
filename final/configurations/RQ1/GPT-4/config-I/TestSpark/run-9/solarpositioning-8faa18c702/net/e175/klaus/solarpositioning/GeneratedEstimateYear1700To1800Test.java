package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear1700To1800Test {

    @Test
    public void estimateYear1700To1800Test() {
        LocalDate date = LocalDate.of(1750, 5, 1);
        assertEquals(19.379900308777902, DeltaT.estimate(date), 0.1);
    }

}