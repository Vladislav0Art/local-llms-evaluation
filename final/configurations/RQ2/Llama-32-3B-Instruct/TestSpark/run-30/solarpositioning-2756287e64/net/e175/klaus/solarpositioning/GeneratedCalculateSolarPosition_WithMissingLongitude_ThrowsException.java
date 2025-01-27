package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSolarPosition_WithMissingLongitude_ThrowsException {

    @Test
    public void calculateSolarPosition_WithMissingLongitude_ThrowsException() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double deltaT = 0.0;

        when(Grena3.class.getMethod("calculateSolarPosition", ZonedDateTime.class, double[].class)).usingArgs(date, new double[]{latitude}, null).whenCalled().thenReturn(null);

        // Act and Assert
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, null, deltaT));
    }

}