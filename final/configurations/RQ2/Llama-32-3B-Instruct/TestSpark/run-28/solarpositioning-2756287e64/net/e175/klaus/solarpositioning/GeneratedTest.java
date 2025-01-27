package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    private int hour;
    private int minute;

    public ZonedDateTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "[" + hour + ":" + minute + "]";
    }
}

public class AzimuthZenithAngle {
    private int azimuth;
    private int zenith;

    public AzimuthZenithAngle(int azimuth, int zenith) {
        this.azimuth = azimuth;
        this.zenith = zenith;
    }

    public int getAzimuth() {
        return azimuth;
    }

    public int getZENITH() {
        return zenith;
    }
}

public class MainTest {

    @BeforeAll
    public static void setup() {
        // some initialization code
    }

}