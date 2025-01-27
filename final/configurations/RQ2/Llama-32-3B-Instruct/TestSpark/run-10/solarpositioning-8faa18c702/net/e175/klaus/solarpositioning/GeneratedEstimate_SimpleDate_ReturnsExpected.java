package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static java.lang.Math.pow;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_SimpleDate_ReturnsExpected {

    public LocalDate FOR_DATE = LocalDate.of(2022, 6, 1);

    @Mock
    private net.e175.klaus.solarpositioning.SolarPositioning solarPositioning;

    @Test
    public void estimate_SimpleDate_ReturnsExpected() {
        when(solarPositioning.getSolarPosition(FOR_DATE)).thenReturn(new net.e175.klaus.solarpositioning.SolarPosition(0, 0));
        double deltaT = DeltaT.estimate(FOR_DATE);
        assertDeltaT(deltaT);
    }

}