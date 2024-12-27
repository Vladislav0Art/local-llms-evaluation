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

public class GeneratedEstimate_ForInvalidMonth_ReturnsCorrectDeltaT {

    @Mock
    private NetE175KlausSolarPositioningNetE175KlausSolarPositioningHelper helperMethodMock;

    public double calculateDeltaT(LocalDate date) {
        return 30.0;
    }

    @Test
    public void estimate_ForInvalidMonth_ReturnsCorrectDeltaT() {
        when(helperMethodMock.calculateDeltaT(Mockito.any(LocalDate.class))).thenReturn(30.0);
        Object deltaT = DeltaT.estimate(LocalDate.of(2022, 13, 1));
        assertTrue(deltaT instanceof Double);
        assertEquals(30.0, (double) deltaT, 1e-9);
    }

}