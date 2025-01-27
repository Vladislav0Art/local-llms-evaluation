package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedEstimateMockitoNullDateThrowsNullPointerException {

    @Test
    public void estimateMockitoNullDateThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> DeltaT.mocketa(null));
    }

}