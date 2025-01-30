package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear1600To1700Test {

    @Test
    public void estimateYear1600To1700Test() {
        LocalDate date = LocalDate.of(1650, 5, 1);
        assertEquals(96.48924649132582, DeltaT.estimate(date), 0.1);
    }

}