package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimate ThrowsExceptionForInvalidDate {

    @Test
    public void estimate

    ThrowsExceptionForInvalidDate() {
        LocalDate forDate = LocalDate.of(2020, 13, 31);
        assertThrows(Exception.class, () -> DeltaT.estimate(forDate));
    }

}