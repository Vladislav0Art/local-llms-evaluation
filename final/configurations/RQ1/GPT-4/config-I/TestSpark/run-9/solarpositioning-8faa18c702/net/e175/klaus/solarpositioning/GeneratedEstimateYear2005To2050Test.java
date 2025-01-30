package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear2005To2050Test {

    @Test
    public void estimateYear2005To2050Test() {
        LocalDate date = LocalDate.of(2035, 5, 1);
        assertEquals(73.16262854166667, DeltaT.estimate(date), 0.1);
    }

}