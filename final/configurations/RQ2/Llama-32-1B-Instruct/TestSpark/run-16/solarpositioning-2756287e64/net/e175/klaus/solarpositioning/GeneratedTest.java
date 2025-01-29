package net.e175.klaus.solarpositioning;

import com.github.javaparser.ast.body.MethodDeclaration;
import org.junit.Test;

public class GeneratedTest {

    private final Grena3 G
    Rena3 =new

    Grena3();

    @Test
    public void calculateSolarPosition_Latitude_Azimuth() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        double longitude = -13.4058;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, longitude, 0);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_Latitude_DeltaT() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        double longitude = -13.4058;
        double deltaT = 30;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_Latitude_Pressure() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        double longitude = -13.4058;
        double pressure = 101325;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, longitude, 0, pressure);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_Latitude_Temperature() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        double longitude = -13.4058;
        int temperature = 288;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, longitude, 0, 101325, temperature);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_Latitude_Elevation() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        double longitude = -13.4058;
        int elevation = 300;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, longitude, 0, 101325, elevation);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_Latitude_South() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        int south = -30;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, south);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_East() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        int east = -120;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, east);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_East_North() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        int eastNorth = -45;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, eastNorth);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_North() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        int north = -90;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, north);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_West() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        int west = -180;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, west);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_West_North() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        int westNorth = -90;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, westNorth);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

}