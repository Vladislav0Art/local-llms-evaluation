package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateAtMiddleOfTheTimeScaleTest {

    @Test
    public void estimateAtMiddleOfTheTimeScaleTest() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        assertNotEquals(0, DeltaT.estimate(date), 0.01);
    }

}