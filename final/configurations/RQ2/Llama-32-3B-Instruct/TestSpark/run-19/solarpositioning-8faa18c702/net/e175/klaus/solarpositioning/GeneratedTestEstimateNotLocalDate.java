package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimateNotLocalDate {

    @Test
    public void testEstimateNotLocalDate() {
        assertThrows(ClassCastException.class, () -> DeltaT.estimate("2022-06-15"));
    }

}