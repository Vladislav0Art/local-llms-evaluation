package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Random;

public class GeneratedEstimate_ReturnsDouble {

    @Test
    public void estimate_ReturnsDouble() {
        double result = DeltaT.estimate(LocalDate.now());
        assertTrue(Double.isFinite(result));
        assertFalse(Double.isNaN(result));
    }

}