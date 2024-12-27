package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        LocalDate nullDate = null;
        DeltaT.estimate(nullDate);
    }

}