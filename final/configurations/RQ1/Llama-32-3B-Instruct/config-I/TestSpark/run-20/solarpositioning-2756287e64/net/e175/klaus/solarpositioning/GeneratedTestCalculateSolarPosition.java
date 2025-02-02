package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCalculateSolarPosition {

    private final ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
    @Mock
    private JulianDate julianDate;

    @Before
    public void setup() {
        when(julianDate.calculateDate()).thenReturn(date);
    }

    @Test
    public void testCalculateSolarPosition() {
        // Arrange
        double latitude = 45.0;
        double longitude = -120.0;
        when(Grena3.class.getMethod("calculateSolarPosition", double[].class)).thenReturn(new AzimuthZenithAngle(0.0, 0.0));

        // Act
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(latitude, longitude);

        // Assert
        assertEquals(0.0, result.getangle(), 0.01);
        assertEquals(0.0, result.getzenith(), 0.01);
    }

}