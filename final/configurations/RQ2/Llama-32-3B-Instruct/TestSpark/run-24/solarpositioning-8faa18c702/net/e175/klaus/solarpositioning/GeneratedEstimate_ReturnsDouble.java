package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_ReturnsDouble {

    @Mock
    private SunPositioningService sunPositioningServiceMock;

    public void setup() {
        when(sunPositioningServiceMock.getDeltaT(any(LocalDate.class))).thenReturn(Optional.of(1.0));
    }

    @Test
    public void estimate_ReturnsDouble() {
        setup();
        double result = DeltaT.estimate(new LocalDate());
        assertIsInstance(result, Double.class);
    }
}

class SunPositioningService {
    public Optional<Double> getDeltaT(LocalDate forDate) {
    }

}