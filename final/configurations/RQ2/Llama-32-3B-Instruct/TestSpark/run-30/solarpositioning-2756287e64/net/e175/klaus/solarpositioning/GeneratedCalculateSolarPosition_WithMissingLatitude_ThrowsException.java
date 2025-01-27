package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSolarPosition_WithMissingLatitude_ThrowsException {

    @Test
    public void calculateSolarPosition_WithMissingLatitude_ThrowsException() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double longitude = 0.0;
        double deltaT = 0.0;

        when(Grena3.class.getMethod("calculateSolarPosition", ZonedDateTime.class, double[].class)).usingArgs(date, null, new double[]{longitude}).whenCalled().thenReturn(null);

        // Act and Assert
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, null, longitude, deltaT));
    }

}