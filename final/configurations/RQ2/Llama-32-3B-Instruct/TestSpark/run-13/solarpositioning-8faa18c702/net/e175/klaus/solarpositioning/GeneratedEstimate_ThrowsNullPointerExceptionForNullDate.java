package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimate_ThrowsNullPointerExceptionForNullDate {

    @Test
    public void estimate_ThrowsNullPointerExceptionForNullDate() {
        org.junit.jupiter.api.Assertions.assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

}