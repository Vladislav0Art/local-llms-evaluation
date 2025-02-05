package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateAtEndDateOfTheTimeScaleTest {

    @Test
    public void estimateAtEndDateOfTheTimeScaleTest() {
        LocalDate date = LocalDate.of(2019, 12, 31);
        assertNotEquals(0, DeltaT.estimate(date), 0.01);
    }

}