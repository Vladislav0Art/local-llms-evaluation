package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_WithValidInput_ReturnsCorrectResult {

    @Mock
    private ZonedDateTime date;

    @Test
    public void calculateSolarPosition_WithValidInput_ReturnsCorrectResult() {
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 3600.0;

        Grena3 grena3 = new Grena3();

        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

}