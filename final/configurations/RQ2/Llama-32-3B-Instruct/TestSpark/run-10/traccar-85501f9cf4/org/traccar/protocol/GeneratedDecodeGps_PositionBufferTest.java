package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDecodeGps_PositionBufferTest {

    @Test
    public void decodeGps_PositionBufferTest() {
        // Arrange
        Position position = new Position(0, 0, 100);
        ByteBuf buf = Unpooled.buffer();

        // Act
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, true));

        // Assert
        assertNull(buf.readRetainerBuffer());
    }

}