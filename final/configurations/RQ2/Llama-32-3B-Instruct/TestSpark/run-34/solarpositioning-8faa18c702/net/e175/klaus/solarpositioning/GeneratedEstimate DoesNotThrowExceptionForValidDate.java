package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimate DoesNotThrowExceptionForValidDate {

    @Test
    public void estimate

    DoesNotThrowExceptionForValidDate() {
        LocalDate forDate = LocalDate.of(2020, 1, 31);
        try {
            DeltaT.estimate(forDate);
            assertTrue(true);
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }

}