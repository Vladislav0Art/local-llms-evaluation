package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDecodeGps_PositionNoBufferReturnsFalseTest {

    @Test
    public void decodeGps_PositionNoBufferReturnsFalseTest() {
        // Arrange
        Position position = new Position(0, 0, 100);
        ByteBuf buf = null;

        // Act
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true));

        // Assert
        assertNull(buf.readRetainerBuffer());
    }

}