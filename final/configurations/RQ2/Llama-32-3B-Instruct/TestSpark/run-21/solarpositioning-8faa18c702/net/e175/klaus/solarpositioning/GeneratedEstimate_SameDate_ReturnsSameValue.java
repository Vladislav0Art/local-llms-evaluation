package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Random;

public class GeneratedEstimate_SameDate_ReturnsSameValue {

    @Test
    public void estimate_SameDate_ReturnsSameValue() {
        LocalDate today = LocalDate.now();
        double result1 = DeltaT.estimate(today);
        double result2 = DeltaT.estimate(today);
        assertEquals(result1, result2, 0.001); // compare with a small delta
    }

}