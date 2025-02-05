package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateBetween1986And2005Test {

    @Test
    public void EstimateBetween1986And2005Test() {
        LocalDate date = LocalDate.of(1995, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(61.34, result, 0.01);
    }

}