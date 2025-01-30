package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearMoreThan2150Test {

    @Test
    public void estimateYearMoreThan2150Test() {
        LocalDate date = LocalDate.of(2200, 5, 1);
        assertEquals(436.0, DeltaT.estimate(date), 0.1);
    }

}