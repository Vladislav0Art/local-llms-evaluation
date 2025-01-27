package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_ForValidDateReturnsNonZero {

    @Mock
    private SunPositioningService sunPositioningServiceMock;

    public void setup() {
        when(sunPositioningServiceMock.getDeltaT(any(LocalDate.class))).thenReturn(Optional.of(1.0));
    }

    @Test
    public void estimate_ForValidDateReturnsNonZero() {
        setup();
        double result = DeltaT.estimate(new LocalDate());
        assertEquals(1.0, result, 0.00001);
    }

}