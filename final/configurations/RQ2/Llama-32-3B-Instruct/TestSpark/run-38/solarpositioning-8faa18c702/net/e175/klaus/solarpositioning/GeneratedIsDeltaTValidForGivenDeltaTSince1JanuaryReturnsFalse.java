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
public class GeneratedIsDeltaTValidForGivenDeltaTSince1JanuaryReturnsFalse {

    @Test
    public void isDeltaTValidForGivenDeltaTSince1JanuaryReturnsFalse() {
        // Given
        double deltaT = -10.0;
        Mockito.when(SunLocation.getSince1Jan(any(Double.class))).thenReturn(deltaT);

        // When and Then
        assertFalse(DeltaT.isValid(deltaT));
    }

}