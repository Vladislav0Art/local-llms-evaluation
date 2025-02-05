package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateBetween1986And1997Test {

    @Test
    public void EstimateBetween1986And1997Test() {
        LocalDate date = LocalDate.of(1990, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(56.30, result, 0.01);
    }

}