package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCalculateSolarPosition_Grenz_withValidParameters_FieldsShouldBeSet {

    @Test
    public void calculateSolarPosition_Grenz_withValidParameters_FieldsShouldBeSet() {
        // Arrange
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 1; // seconds

        Grena3 grena3 = new Grena3();
        GrentzMocker grentzMocker = new GrentzMocker();
        GrentzResult grentzResult = mock(GrentzResult.class);
        MockObservation observation = mock(MockObservation.class);

        // Act
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, deltaT, grentzMocker, grentzResult, observation);

        // Assert
        verify(grentzMocker).setPressure(1017);
        verify(grentzMocker).setTemperature(-273.15);
    }

}