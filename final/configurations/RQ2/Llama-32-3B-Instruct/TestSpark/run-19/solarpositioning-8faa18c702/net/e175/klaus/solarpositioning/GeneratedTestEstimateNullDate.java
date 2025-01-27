package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimateNullDate {

    @Test
    public void testEstimateNullDate() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

}