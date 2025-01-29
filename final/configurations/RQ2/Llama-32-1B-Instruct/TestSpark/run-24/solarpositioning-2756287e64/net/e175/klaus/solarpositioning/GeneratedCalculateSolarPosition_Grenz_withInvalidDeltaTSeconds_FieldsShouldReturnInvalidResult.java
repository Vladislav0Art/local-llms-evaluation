package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class GeneratedCalculateSolarPosition_Grenz_withInvalidDeltaTSeconds_FieldsShouldReturnInvalidResult {

    @Test
    public void calculateSolarPosition_Grenz_withInvalidDeltaTSeconds_FieldsShouldReturnInvalidResult() {
        // Arrange
        ZonedDateTime date = mock(ZonedDateTime.class);
        GrentzMocker grentzMocker = new GrentzMocker();
        MockObservation observation = mock(MockObservation.class);

        // Act and Assert
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, 37.7749, -122.4194, 1 + 1e30, grentzMocker, observation);
        verifyNoExceptionIsThrown();

        GrentzMocker grentzMockerToTest = new GrentzMocker();
        MockObservation observationToTest = mock(MockObservation.class);

        // Assert
        verify(grentzMocker).setPressure(1017);
    }

}