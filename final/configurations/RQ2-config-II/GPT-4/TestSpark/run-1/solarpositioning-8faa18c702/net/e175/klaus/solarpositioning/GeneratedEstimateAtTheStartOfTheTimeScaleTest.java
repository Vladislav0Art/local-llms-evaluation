package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateAtTheStartOfTheTimeScaleTest {

    @Test
    public void estimateAtTheStartOfTheTimeScaleTest() {
        LocalDate date = LocalDate.of(1620, 1, 1);
        assertEquals(0, DeltaT.estimate(date), 0.01);
    }

}