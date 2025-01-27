package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDecodeGps_PositionWithSpeedReturnsTrueTest {

    @Test
    public void decodeGps_PositionWithSpeedReturnsTrueTest() {
        // Arrange
        Position position = new Position(0, 0, 100);
        ByteBuf buf = Unpooled.buffer();
        BcdUtil.addBcdToBuffer(position.getAltitude(), buf);

        // Act
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, true));

        // Assert
        assertFalse(buf.readRetainerBuffer());
    }

}