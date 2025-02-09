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
public class GeneratedIsDeltaTSince12DecemberForGivenDateReturnsCorrectDeltaT {

    @Test
    public void isDeltaTSince12DecemberForGivenDateReturnsCorrectDeltaT() {
        // Given
        LocalDate forDate = LocalDate.of(2000, 1, 15);
        Mockito.when(SunLocation.getSince1Jan(any(Double.class))).thenReturn(10.0);

        // When and Then
        assertEquals(10.0, DeltaT.isSince12Dec(forDate), 1e-9);
    }

}