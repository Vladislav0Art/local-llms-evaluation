package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestEstimateWithNull {

    @Mock
    private SunPositioningService sunPositioningService;

    @Test
    public void testEstimateWithNull() {
        when(sunPositioningService.getDeltaT(any(LocalDate.class))).thenReturn(Optional.empty());
        assertEquals(Double.NaN, DeltaT.estimate(null));
    }

}