package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedTestEstimateThrowsExceptionForInvalidDate {

    @Test
    public void testEstimateThrowsExceptionForInvalidDate() {
        LocalDate forDate = LocalDate.of(2020, 13, 31);
        assertThrows(Exception.class, () -> DeltaT.estimate(forDate));
    }

}