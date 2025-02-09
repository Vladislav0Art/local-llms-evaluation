package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        LocalDate date = null;
        double result = DeltaT.estimate(date);
    }

}