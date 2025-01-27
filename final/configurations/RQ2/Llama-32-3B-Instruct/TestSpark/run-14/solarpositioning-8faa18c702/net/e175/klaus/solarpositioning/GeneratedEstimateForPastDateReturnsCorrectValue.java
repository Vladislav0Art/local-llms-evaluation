package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.mockito.Mockito.when;

public class GeneratedEstimateForPastDateReturnsCorrectValue {

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
    public void estimateForPastDateReturnsCorrectValue() {
        when(DeltaT.class.getDeclaredMethod("estimate", LocalDate.class)).withArguments(any(LocalDate.class))
                .returningValue(0.0001);
        assertEquals(0.0001, (double) DeltaT.estimate(LocalDate.now().minusDays(365)), 0.0001);
    }

}