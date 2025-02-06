package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateForDateNegativeDayTest {

    @Test
    public void estimateForDateNegativeDayTest() {
        LocalDate date = LocalDate.of(-1, 1, 1);
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(date));
    }

}