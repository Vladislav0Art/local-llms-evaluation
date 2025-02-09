package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateDateInPresentTest {

    @Test
    public void estimateDateInPresentTest() {
        LocalDate date = LocalDate.now();
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

}