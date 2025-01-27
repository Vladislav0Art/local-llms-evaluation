package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_InvalidDate_ThrowsException {

    @Test
    public void estimate_InvalidDate_ThrowsException() {
        doThrow(Exception.class).when(DeltaT::estimate).with(LocalDate null);
        try {
            DeltaT.estimate(null);
        } catch (Exception e) {
        }
    }

}