package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateForPresentDateTest {

    @Test
    public void estimateForPresentDateTest() {
        LocalDate presentDate = LocalDate.now();
        double result = DeltaT.estimate(presentDate);
        // The value may vary depending on the execution date, it's an approximation.
        assertEquals(69.71, result, 10.001);
    }

}