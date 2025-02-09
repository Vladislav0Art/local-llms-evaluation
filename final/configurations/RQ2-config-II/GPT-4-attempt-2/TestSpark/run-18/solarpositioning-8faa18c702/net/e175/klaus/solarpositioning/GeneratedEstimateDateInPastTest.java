package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateDateInPastTest {

    @Test
    public void estimateDateInPastTest() {
        LocalDate date = LocalDate.of(1900, 1, 1);
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

}