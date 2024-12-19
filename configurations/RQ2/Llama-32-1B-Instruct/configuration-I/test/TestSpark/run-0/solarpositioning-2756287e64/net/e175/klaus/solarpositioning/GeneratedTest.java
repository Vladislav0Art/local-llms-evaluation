package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public final class TestCalculateSolarPosition {

        @Test
        public void testFixtures() {
            ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0);
            double latitude = 52.5206; // Berlin
            double longitude = -13.4055;
            double deltaT = Math.random();

            AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

            assertEquals(42.1, result.getAzimuth(), 0.01);
        }
    }

    @Test
    public void testFixtures() {
        ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0);
        double latitude = 52.5206; // Berlin
        double longitude = -13.4055;
        double deltaT = Math.random();
        double pressure = 1013 + Math.random();

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure);

        assertEquals(42.1, result.getAzimuth(), 0.01);
    }
}

@Test
public void testFixtures() {
    ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0);
    double latitude = 52.5206; // Berlin
    double longitude = -13.4055;
    double deltaT = Math.random();
    double temperature = Math.abs(Math.random() * 20) + 10;

    AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, temperature);

    assertEquals(42.1, result.getAzimuth(), 0.01);
}
	}

@Test
public void testFixtures() {
    ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0);
    double latitude = 52.5206; // Berlin
    double longitude = -13.4055;
    int deltaT = Math.random();

    try {
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        fail("Expected exception not thrown");
    } catch (Exception e) {
        pass();
    }
}
	}

@Test
public void testFixtures() {
    ZonedDateTime date = null;
    double latitude = 52.5206; // Berlin
    double longitude = -13.4055;
    int deltaT = Math.random();

    try {
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        fail("Expected exception not thrown");
    } catch (Exception e) {
        pass();
    }
}
	}

@Test
public void testFixtures() {
    ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0);
    double latitude = 52.5206; // Berlin

    AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, 0, 0);

    assertEquals(42.1, result.getAzimuth(), 0.01);
}
	}

@Test
public void testFixtures() {
    ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0);
    double latitude = 52.5206; // Berlin

    try {
        Grena3.calculateSolarPosition("date", latitude, 0, 0);
        fail("Expected exception not thrown");
    } catch (Exception e) {
        pass();
    }
}
	}

@Test
public void testFixtures() {
    ZonedDateTime date = new ZonedDateTime(2022, 1, 1, 12, 0);
    double latitude = 52.5206; // Berlin

    try {
        Grena3.calculateSolarPosition("ddmmyyyy", latitude, 0, 0);
        fail("Expected exception not thrown");
    } catch (Exception e) {
        pass();
    }
}
	}

            }