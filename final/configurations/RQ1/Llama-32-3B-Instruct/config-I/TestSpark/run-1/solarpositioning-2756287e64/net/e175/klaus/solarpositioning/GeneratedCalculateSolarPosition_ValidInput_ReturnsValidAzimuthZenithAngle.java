package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSolarPosition_ValidInput_ReturnsValidAzimuthZenithAngle {

    @Mock
    private ZonedDateTime date;

    @Mock
    private DeltaT deltaT;

    public Grena3 grena3;

    @Before
    public void setup() {
        grena3 = new Grena3();
    }

    @Test
    public void calculateSolarPosition_ValidInput_ReturnsValidAzimuthZenithAngle() {
        when(deltaT.getDeltaTime()).thenReturn(1000.0);
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, 0.0, 0.0, deltaT, 1000.0, 20.0);
        assertEquals(15.0, result.getAzimuth(), 1e-6);
    }

}

public class Grena3 {
    public AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, Object deltaT, double time, double altitude) {
        // method implementation
        return null;
    }
}

public class DeltaT {
    private double deltaTime;

    public double getDeltaTime() {
        return deltaTime;
    }

    public void setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
    }
}

public class AzimuthZenithAngle {
    private double azimuth;
    private double deltaRe;

    public double getAzimuth() {
        return azimuth;
    }

    public double getDeltaRe() {
        return deltaRe;
    }

}