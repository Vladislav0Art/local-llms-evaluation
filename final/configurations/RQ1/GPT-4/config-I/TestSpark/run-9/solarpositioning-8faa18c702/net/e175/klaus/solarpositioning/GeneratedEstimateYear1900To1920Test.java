package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear1900To1920Test {

    @Test
    public void estimateYear1900To1920Test() {
        LocalDate date = LocalDate.of(1910, 5, 1);
        assertEquals(4.020587738411123, DeltaT.estimate(date), 0.1);
    }

}