package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static java.lang.Math.pow;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_NaiveDate_ReturnsZero {

    public LocalDate FOR_DATE = LocalDate.of(2022, 6, 1);

    @Mock
    private net.e175.klaus.solarpositioning.SolarPositioning solarPositioning;

    @Test
    public void estimate_NaiveDate_ReturnsZero() {
        when(solarPositioning.getSolarPosition(FOR_DATE)).thenReturn(null);
        double deltaT = DeltaT.estimate(FOR_DATE);
        assertEquals(0, deltaT);
    }

}