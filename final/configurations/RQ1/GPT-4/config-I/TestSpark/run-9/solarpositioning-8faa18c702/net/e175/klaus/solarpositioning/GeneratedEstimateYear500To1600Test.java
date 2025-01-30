package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear500To1600Test {

    @Test
    public void estimateYear500To1600Test() {
        LocalDate date = LocalDate.of(1495, 5, 1);
        assertEquals(1739.7742863697716, DeltaT.estimate(date), 0.1);
    }

}