package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static java.lang.Math.pow;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_InvalidDate_ThrowsException {

    public LocalDate FOR_DATE = LocalDate.of(2022, 6, 1);

    @Mock
    private net.e175.klaus.solarpositioning.SolarPositioning solarPositioning;

    @Test
    public void estimate_InvalidDate_ThrowsException() {
        when(solarPositioning.getSolarPosition(FOR_DATE)).thenThrow(new IllegalArgumentException());
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(FOR_DATE));
    }

}