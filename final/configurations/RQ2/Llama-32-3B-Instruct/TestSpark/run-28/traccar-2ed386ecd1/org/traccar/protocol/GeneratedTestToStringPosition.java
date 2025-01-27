package org.traccar.protocol;

public class GeneratedTestToStringPosition {

    private double latitude;
    private double longitude;

    public Position(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "(" + latitude + ", " + longitude + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Position position = (Position) obj;
        return Double.compare(position.latitude, latitude) == 0 && Double.compare(position.longitude, longitude) == 0;
    }
}

public class TestPosition {

    @Test
    public void testToStringPosition() {
        Position position = new Position(37.7749, -122.4194);
        assertEquals("(37.7749,-122.4194)", position.toString());
    }

}