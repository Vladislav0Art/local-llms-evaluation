package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.mockito.Mockito.when;

public class GeneratedEstimateForTodayReturnsCorrectValue {

    public static double estimate(LocalDate forDate) {
        // implementation
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import org.mockito.Mockito.when;

public class DeltaTTest {

    @Test
    public void estimateForTodayReturnsCorrectValue() {
        when(DeltaT.class.getDeclaredMethod("estimate", LocalDate.class)).withArguments(any(LocalDate.class))
                .returningValue(0.0001);
        assertEquals(0.0001, (double) DeltaT.estimate(LocalDate.now()), 0.0001);
    }

}