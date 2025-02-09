package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException ex) {
            // success
        }
    }

}