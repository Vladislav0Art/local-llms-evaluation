package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;
import net.e175.klaus.solarpositioning.DeltaTStub;
import net.e175.klaus.solarpositioning.SunLocation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsDeltaTSince1JanuaryForGivenDateReturnsCorrectDeltaT {

    @Test
    public void isDeltaTSince1JanuaryForGivenDateReturnsCorrectDeltaT() {
        // Given
        LocalDate forDate = LocalDate.of(2000, 12, 15);
        Mockito.when(SunLocation.getSince1Jan(any(Double.class))).thenReturn(10.0);

        // When and Then
        assertEquals(10.0, DeltaT.isSince1Jan(forDate), 1e-9);
    }

}