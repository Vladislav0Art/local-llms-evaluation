package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;

import static net.e175.klaus.solarpositioning.Grena3.*;
import static org.junit.Assert.*;

public class GeneratedTestCalculateSolarPosition_noDeltaTPressureTemperatureLatitudeLongitude {

    private Grena3 instance;

    @Before
    public void setup() {
        instance = new Grena3();
    }

    @Test
    public void testCalculateSolarPosition_noDeltaTPressureTemperatureLatitudeLongitude() {
        // Arrange
        double[] expectedAngles = {getExpectedAngle(), getExpectedAngle()};
        double temperature = 25; // arbitrary value

        // Act and Assert
        assertNull(instance.calculateSolarPosition(null, null, null, pressure, temperature(), null));
    }

}