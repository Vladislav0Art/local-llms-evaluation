package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateBefore1986Test {

    @Test
    public void EstimateBefore1986Test() {
        LocalDate date = LocalDate.of(1980, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(16.44, result, 0.01);
    }

}