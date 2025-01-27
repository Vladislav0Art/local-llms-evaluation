package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.mockito.Mockito.when;

public class GeneratedEstimateForDateReturnsZero {

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
    public void estimateForDateReturnsZero() {
        when(DeltaT.class.getDeclaredMethod("estimate", LocalDate.class)).withArguments(any(LocalDate.class))
                .returningValue(0.0);
        assertEquals(0.0, (double) DeltaT.estimate(any(LocalDate.class)), 0.0001);
    }

}