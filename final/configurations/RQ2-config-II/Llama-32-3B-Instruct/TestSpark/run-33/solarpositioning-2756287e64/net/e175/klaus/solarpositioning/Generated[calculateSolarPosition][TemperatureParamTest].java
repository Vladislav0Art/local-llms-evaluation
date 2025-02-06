package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class Generated[calculateSolarPosition][TemperatureParamTest]{

@Mock
private ZoneOffset zoneOffset;

public AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude) {
    return new AzimuthZenithAngle(0.0, 0.0);
}

public AzimuthZenithAngle calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT, double pressure, double temperature) {
    return new AzimuthZenithAngle(1.0, 2.0);
}

@Test
public void [calculateSolarPosition][TemperatureParamTest](){
ZonedDateTime date = ZonedDateTime.now(zoneOffset);
double latitude = 0.0;
double longitude = 0.0;
AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 2.0, 3.0);

assertNotNull(result);
	}

            }