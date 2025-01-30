package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYear1920To1941Test {

    @Test
    public void estimateYear1920To1941Test() {
        LocalDate date = LocalDate.of(1930, 5, 1);
        assertEquals(13.769129382978723, DeltaT.estimate(date), 0.1);
    }

}