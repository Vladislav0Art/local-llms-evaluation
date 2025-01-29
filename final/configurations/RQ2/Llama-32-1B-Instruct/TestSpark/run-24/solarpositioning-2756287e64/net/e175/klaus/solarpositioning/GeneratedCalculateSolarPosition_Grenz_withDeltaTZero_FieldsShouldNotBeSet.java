package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCalculateSolarPosition_Grenz_withDeltaTZero_FieldsShouldNotBeSet {

    @Test
    public void calculateSolarPosition_Grenz_withDeltaTZero_FieldsShouldNotBeSet() {
        // Arrange
        ZonedDateTime date = mock(ZonedDateTime.class);
        double latitude = 37.7749;
        double longitude = -122.4194;
        GrentzMocker grentzMocker = new GrentzMocker();
        MockObservation observation = mock(MockObservation.class);

        // Act
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, 0, grentzMocker, observation);

        // Assert
        verify(grentzMocker).setPressure(1017);
    }

}