package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Random;

public class GeneratedEstimate_InvalidInput_ThrowsException {

    @Test
    public void estimate_InvalidInput_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(null));
    }

}