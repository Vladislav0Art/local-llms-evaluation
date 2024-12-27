package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

public class GeneratedEstimate_CoordinatesNull_ThrowsNullPointerException {

    @Mock
    private NetE175KlausSolarPositioningNetE175KlausSolarPositioningHelper helperMethodMock;

    public double calculateDeltaT(LocalDate date) {
        return 30.0;
    }

    @Test
    public void estimate_CoordinatesNull_ThrowsNullPointerException() {
        when(helperMethodMock.calculateDeltaT(Mockito.any(LocalDate.class))).thenThrow(NullPointerException.class);
        try {
            DeltaT.estimate(null);
            assert false;
        } catch (NullPointerException e) {
            assertEquals("Date cannot be null", e.getMessage());
        }
    }

}