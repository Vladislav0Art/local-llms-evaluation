package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestDecodeGpsWithNoSpeed {

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

}