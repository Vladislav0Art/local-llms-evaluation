package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCalculateSolarPosition_Grenz_withInvalidLongitude_FieldsShouldReturnInvalidResult {

    @Test
    public void calculateSolarPosition_Grenz_withInvalidLongitude_FieldsShouldReturnInvalidResult() {
        // Arrange
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitudeMinusOneDegrees = -37.7750;
        GrentzMocker grentzMocker = new GrentzMocker();
        MockObservation observation = mock(MockObservation.class);

        // Act and Assert
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitudeMinusOneDegrees, -122.4200, -1, grentzMocker, observation);
        verifyNoExceptionIsThrown();

        double longitudeMinusOneDegreesMinusTwoDegrees = -122.4210;
        GrentzMocker grentzMockerToTest = new GrentzMocker();
        MockObservation observationToTest = mock(MockObservation.class);

        // Assert
        verify(grentzMocker).setPressure(1017);
    }

}