package org.traccar.protocol;

public class GeneratedTestCopiedBufferWithStandardCharsets {

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
    public void testCopiedBufferWithStandardCharsets() throws Exception {
        byte[] buffer = "1".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        assertEquals("1", new String(buffer, java.nio.charset.StandardCharsets.UTF_8));
    }
}

}