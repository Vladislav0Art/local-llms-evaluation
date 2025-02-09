package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateDateOnLeapYearTest {

    @Test
    public void estimateDateOnLeapYearTest() {
        double deltaT = DeltaT.estimate(LocalDate.of(2000, 2, 29));
        assertTrue(Double.isFinite(deltaT));
    }

}