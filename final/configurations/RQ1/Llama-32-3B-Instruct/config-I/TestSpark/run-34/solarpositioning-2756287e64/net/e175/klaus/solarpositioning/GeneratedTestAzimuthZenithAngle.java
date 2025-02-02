package net.e175.klaus.solarpositioning;

public class GeneratedTestAzimuthZenithAngle {

    public static class G Rena3 {

        public double getAzimuthZenithAngle(int altitude, int azimuth) {
            return Math.toDegrees(Math.atan(Math.tan(Math.toRadians(altitude)) / Math.cos(Math.toRadians(azimuth))));
        }
    }

    @Test
    public void testAzimuthZenithAngle() {
        // Arrange
        G Rena3 az = new G Rena3();

        // Act
        double value1 = az.getAzimuthZenithAngle(12, 30);
        double value2 = az.getAzimuthZenithAngle(13, 0);

        // Assert
        assertEquals(60.0, value1, 0.01);
        assertEquals(90.0, value2, 0.01);
    }

}