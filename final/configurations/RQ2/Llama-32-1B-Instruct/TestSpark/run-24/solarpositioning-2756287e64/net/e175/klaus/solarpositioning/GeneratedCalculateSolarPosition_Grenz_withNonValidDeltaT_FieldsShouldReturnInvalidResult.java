package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCalculateSolarPosition_Grenz_withNonValidDeltaT_FieldsShouldReturnInvalidResult {

    @Test
    public void calculateSolarPosition_Grenz_withNonValidDeltaT_FieldsShouldReturnInvalidResult() {
        // Arrange
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 37.7749;
        double longitude = -122.4194;
        GrentzMocker grentzMocker = new GrentzMocker();
        MockObservation observation = mock(MockObservation.class);

        // Act and Assert
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, -1, grentzMocker, observation);
        verifyNoExceptionIsThrown();

        double latitudeMinusOneDegrees = -37.7750;
        double longitudeMinusOneDegrees = -122.4200;

        // Assert
        verify(grentzMocker).setPressure(1017);
    }

}