package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestWithNullDate {

    @Test
    public void estimateTestWithNullDate() {
        try {
            DeltaT.estimate(null);
            fail("Should have thrown NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

}