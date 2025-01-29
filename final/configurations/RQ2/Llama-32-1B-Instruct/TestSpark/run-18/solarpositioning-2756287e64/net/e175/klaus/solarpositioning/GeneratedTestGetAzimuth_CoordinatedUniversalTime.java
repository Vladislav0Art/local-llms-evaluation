package net.e175.klaus.solarpositioning;

public class GeneratedTestGetAzimuth_CoordinatedUniversalTime {

    public static int getAzimuth(double latitude, double longitude) {
        // Calculate azimuth based on latitude and longitude
        if (latitude < 0 && longitude > 180) {
            return 360 - getAzimuth(-latitude, longitude);
        } else if (latitude > 90 && longitude > 180) {
            return 360 + getAzimuth(latitude, -longitude);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getAzimuth(40.7128, -74.0060));
        System.out.println(getAzimuth(-40.7128, 114.1090));
    }
}

public class SolarPositionGeneratorTest {

    @Test
    public void testGetAzimuth_CoordinatedUniversalTime() {
        int azimuth = SolarPositionGenerator.getAzimuth(-40.7128, 114.1090);
        assert azimuth == 90;
    }

}