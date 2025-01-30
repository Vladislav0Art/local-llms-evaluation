package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear1860To1900Test {

    @Test
    public void estimateYear1860To1900Test() {
        LocalDate date = LocalDate.of(1885, 5, 1);
        assertEquals(-10.60574579522981, DeltaT.estimate(date), 0.1);
    }

}