package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateDateIn farPastTest {

    @Test
    public void estimateDateIn

    farPastTest() {
        LocalDate date = LocalDate.of(-500, 1, 1);
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

}