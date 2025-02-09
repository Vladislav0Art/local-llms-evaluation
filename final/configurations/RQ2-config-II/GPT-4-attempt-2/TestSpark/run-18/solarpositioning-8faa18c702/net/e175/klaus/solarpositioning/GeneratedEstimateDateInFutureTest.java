package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateDateInFutureTest {

    @Test
    public void estimateDateInFutureTest() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

}