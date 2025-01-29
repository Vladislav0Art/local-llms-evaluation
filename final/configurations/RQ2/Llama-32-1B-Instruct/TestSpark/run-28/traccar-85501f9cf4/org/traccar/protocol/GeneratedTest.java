package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testDecodeGpsPosition() {
        // Arrange
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Unpooled.buffer();

        // Act
        boolean result1 = org.traccar.protocol.Gt06ProtocolDecoder.decodeGps(position, buf, true, null);
        boolean result2 = Gt06ProtocolDecoder.decodeGps(
                new Position(37.7749, -122.4194),
                buf,
                false,
                false,
                false,
                null
        );
        boolean result3 = org.traccar.protocol.Gt06ProtocolDecoder.decodeGps(position, buf, true, null);

        // Assert
        assertEquals(true, result1);
        assertEquals(false, result2);
        assertEquals(result3, result1);
    }

    @Test
    public void testDecodePosition() {
        // Arrange
        Position position = new Position(37.7749, -122.4194);

        // Act
        boolean result1 = org.traccar.protocol.Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), true, null);
        boolean result2 = Gt06ProtocolDecoder.decodeGps(
                new Position(37.7749, -122.4194),
                Unpooled.buffer(),
                false,
                false,
                false,
                null
        );

        // Assert
        assertEquals(true, result1);
        assertEquals(false, result2);
    }

    @Test
    public void testDecodeGpsWithNoLength() {
        // Arrange
        Position position = new Position(37.7749, -122.4194);

        // Act
        boolean result1 = org.traccar.protocol.Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), true, null);
        boolean result2 = Gt06ProtocolDecoder.decodeGps(
                new Position(37.7749, -122.4194),
                Unpooled.buffer(),
                false,
                false,
                false,
                null
        );

        // Assert
        assertEquals(false, result1);
        assertEquals(true, result2);
    }

    @Test
    public void testDecodeGpsWithNoSatellites() {
        // Arrange
        Position position = new Position(37.7749, -122.4194);

        // Act
        boolean result1 = org.traccar.protocol.Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), true, null);
        boolean result2 = Gt06ProtocolDecoder.decodeGps(
                new Position(37.7749, -122.4194),
                Unpooled.buffer(),
                false,
                false,
                true,
                null
        );

        // Assert
        assertEquals(false, result1);
        assertEquals(true, result2);
    }

    @Test
    public void testDecodeGpsWithNoSpeed() {
        // Arrange
        Position position = new Position(37.7749, -122.4194);

        // Act
        boolean result1 = org.traccar.protocol.Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), true, null);
        boolean result2 = Gt06ProtocolDecoder.decodeGps(
                new Position(37.7749, -122.4194),
                Unpooled.buffer(),
                false,
                false,
                false,
                null
        );

        // Assert
        assertEquals(false, result1);
        assertEquals(true, result2);
    }

    @Test
    public void testDecodeGpsWithNoTimezone() {
        // Arrange
        Position position = new Position(37.7749, -122.4194);

        // Act
        boolean result1 = org.traccar.protocol.Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), true, null);
        boolean result2 = Gt06ProtocolDecoder.decodeGps(
                new Position(37.7749, -122.4194),
                Unpooled.buffer(),
                false,
                false,
                false,
                Calendar.getInstance()
        );

        // Assert
        assertEquals(false, result1);
        assertEquals(true, result2);
    }

}