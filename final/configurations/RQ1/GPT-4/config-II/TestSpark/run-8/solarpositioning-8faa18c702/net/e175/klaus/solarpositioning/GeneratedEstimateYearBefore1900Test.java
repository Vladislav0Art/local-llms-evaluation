package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBefore1900Test {

    @Test
    public void estimateYearBefore1900Test() {
        LocalDate date = LocalDate.of(1880, 9, 20);
        double result = DeltaT.estimate(date);
        assertEquals(15.78030308, result, 0.001);
    }

}