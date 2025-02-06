package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_ThrowsNullPointerException_IfForDateIsNull {

    @Test
    public void estimate_ThrowsNullPointerException_IfForDateIsNull() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

}