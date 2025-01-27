package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchProtocol Decoder_ReturnsCorrectPosition {

    @Test
    public void decode_WatchProtocol

    Decoder_ReturnsCorrectPosition() throws Exception {
        // Arrange
        ByteBuf data = Unpooled.buffer(70);
        data.writeBytes(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06});
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act
        Position position = (Position) decoder.decode(null, null, data);

        // Assert
        assertNotNull(position);
    }

}