package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateLaterThanTheStartOfTheTimeScaleTest {

    @Test
    public void estimateLaterThanTheStartOfTheTimeScaleTest() {
        LocalDate date = LocalDate.of(1621, 1, 1);
        assertNotEquals(0, DeltaT.estimate(date), 0.01);
    }

}