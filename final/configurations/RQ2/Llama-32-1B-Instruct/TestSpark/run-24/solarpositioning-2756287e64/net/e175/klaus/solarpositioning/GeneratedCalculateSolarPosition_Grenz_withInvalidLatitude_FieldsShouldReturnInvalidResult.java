package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCalculateSolarPosition_Grenz_withInvalidLatitude_FieldsShouldReturnInvalidResult {

    @Test
    public void calculateSolarPosition_Grenz_withInvalidLatitude_FieldsShouldReturnInvalidResult() {
        // Arrange
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitudeMinusOneDegrees = -37.7750;
        double longitude = -122.4200;
        GrentzMocker grentzMocker = new GrentzMocker();
        MockObservation observation = mock(MockObservation.class);

        // Act and Assert
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitudeMinusOneDegrees, longitude, -1, grentzMocker, observation);
        verifyNoExceptionIsThrown();

        double latitudeMinusOneDegreesMinusOneDegrees = -37.7750;
        double longitudeMinusOneDegrees = -122.4200;

        // Assert
        verify(grentzMocker).setPressure(1017);
    }

}