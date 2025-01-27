package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import static org.mockito.Mockito.when;

public class GeneratedEstimate_NoDateProvided_ThrowsException {

    @Test
    public void estimate_NoDateProvided_ThrowsException() {
        when(DeltaT.estimate(null)).thenThrow(NullPointerException.class);
    }

}