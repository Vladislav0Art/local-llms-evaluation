package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDecodeGps_PositionWithLengthReturnsTrueTest {

    @Test
    public void decodeGps_PositionWithLengthReturnsTrueTest() {
        // Arrange
        Position position = new Position(0, 0, 100);
        ByteBuf buf = Unpooled.buffer();
        BcdUtil.addBcdToBuffer(position.getAltitude(), buf);

        // Act
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, false));

        // Assert
        assertFalse(buf.readRetainerBuffer());
    }

}