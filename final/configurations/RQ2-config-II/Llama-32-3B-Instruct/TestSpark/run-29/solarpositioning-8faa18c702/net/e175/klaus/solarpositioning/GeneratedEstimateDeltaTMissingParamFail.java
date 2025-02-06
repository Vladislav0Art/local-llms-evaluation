package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTMissingParamFail {

    @Test
    public void estimateDeltaTMissingParamFail() {
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(null));
    }

}