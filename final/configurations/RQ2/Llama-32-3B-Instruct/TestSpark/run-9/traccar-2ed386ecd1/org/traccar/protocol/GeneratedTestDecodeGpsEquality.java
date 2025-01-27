package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestDecodeGpsEquality {

    @Test
    public void testDecodeGpsEquality() {
        // Create instances of Position and Date
        Position position = new Position(1.0, 2.0);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        // Test cases for equality of decoded Gps with original data
        assertEquals(position.getLatitude(), Gt06ProtocolDecoder.decodeGps(position, true).getLatitude());
        assertEquals(position.getLatitude(), Gt06ProtocolDecoder.decodeGps(new Position(-1.0, -2.0), false).getLatitude());
    }
}

public class Position {
    private double latitude;
    private double longitude;

    public Position(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}

public class Date {
}

}