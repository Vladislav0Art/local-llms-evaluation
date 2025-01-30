package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearMinus500To500Test {

    @Test
    public void estimateYearMinus500To500Test() {
        LocalDate date = LocalDate.of(200, 5, 1);
        assertEquals(21171.581298056853, DeltaT.estimate(date), 0.1);
    }

}