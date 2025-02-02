package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_MockAndCompare {

    @Test
    public void estimate_MockAndCompare() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        double mockedResult = 0;
        assertEquals(mockedResult, result, 0.01);
    }

}