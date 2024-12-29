package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        LocalDate date = null;
        double result = DeltaT.estimate(date);
    }

}