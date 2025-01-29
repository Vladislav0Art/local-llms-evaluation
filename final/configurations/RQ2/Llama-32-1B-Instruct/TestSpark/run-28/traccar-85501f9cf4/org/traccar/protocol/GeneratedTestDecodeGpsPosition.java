package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestDecodeGpsPosition {

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

}