package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGt06ProtocolDecodeIntoPositionWithSatellitesButNoSpeedTest {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Mock
    private ByteBuf buf;

    @InjectMocks
    private Gt06ProtocolDecoder gt06ProtocolDecoder;

    @Test
    public void decodeGt06ProtocolDecodeIntoPositionWithSatellitesButNoSpeedTest() {
        // Arrange
        when(gt06ProtocolDecoder.decode(any(), any(), any())).thenReturn(positionWithSatellites());

        // Act
        Object result = gt06ProtocolDecoder.decode(deviceSession, deviceSession.getRemoteAddress(), networkMessage);

        // Assert
        assertTrue(result instanceof Position);
    }

    private Position position() {
        return new Position(1, 2, 3);
    }

    private PositionWithSpeedAndSatellites positionWithSpeedAndSatellites() {
        return new PositionWithSpeedAndSatellites(1, 2, 3, "speed", true);
    }

    private PositionWithSpeed positionWithSpeed() {
        return new PositionWithSpeed(1, 2, 3, "speed");
    }

    private PositionWithSatellites positionWithSatellites() {
        return new PositionWithSatellites(1, 2, 3, true);
    }
}

class Position {
    public int latitude;
    public int longitude;
    public int altitude;

    public Position(int latitude, int longitude, int altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return latitude == position.latitude &&
                longitude == position.longitude &&
                altitude == position.altitude;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, altitude);
    }
}

class PositionWithSpeedAndSatellites extends Position {
    private String speed;
    private boolean hasSatellites;

    public PositionWithSpeedAndSatellites(int latitude, int longitude, int altitude, String speed, boolean hasSatellites) {
        super(latitude, longitude, altitude);
        this.speed = speed;
        this.hasSatellites = hasSatellites;
    }
}

class PositionWithSpeed extends Position {
    private String speed;

    public PositionWithSpeed(int latitude, int longitude, int altitude, String speed) {
        super(latitude, longitude, altitude);
        this.speed = speed;
    }
}

class PositionWithSatellites extends Position {
    private boolean hasSatellites;

    public PositionWithSatellites(int latitude, int longitude, int altitude, boolean hasSatellites) {
        super(latitude, longitude, altitude);
        this.hasSatellites = hasSatellites;
    }

}