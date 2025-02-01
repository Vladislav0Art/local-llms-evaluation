package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween500BeforeBCAnd500ADTest {

    @Test
    public void estimateYearBetween500BeforeBCAnd500ADTest() {
        LocalDate date = LocalDate.of(0, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(10876.7, deltaT, 0.01);
    }

}