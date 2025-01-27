package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestEstimate {

    @Mock
    private SunPositioningService sunPositioningService;

    @Test
    public void testEstimate() {
        when(sunPositioningService.getDeltaT(any(LocalDate.class))).thenReturn(Optional.of(1.0));
        assertEquals(1.0, DeltaT.estimate(new LocalDate()));
    }
}

class SunPositioningService {
    public Optional<Double> getDeltaT(LocalDate forDate) {
    }

}