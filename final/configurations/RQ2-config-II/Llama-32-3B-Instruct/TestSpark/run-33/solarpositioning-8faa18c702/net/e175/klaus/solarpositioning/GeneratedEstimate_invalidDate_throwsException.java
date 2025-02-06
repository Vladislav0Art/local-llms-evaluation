package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_invalidDate_throwsException {

    @Test
    public void estimate_invalidDate_throwsException() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(LocalDate.now()));
    }

}