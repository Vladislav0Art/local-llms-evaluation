package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchProtocol Decoder_ReturnsCorrectData {

    @Test
    public void decode_WatchProtocol

    Decoder_ReturnsCorrectData() throws Exception {
        // Arrange
        ByteBuf data = Unpooled.buffer(20);
        data.writeBytes(new byte[]{0x01, 0x02});
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act
        NetworkMessage networkMessage = (NetworkMessage) decoder.decode(null, null, data);

        // Assert
        assertNotNull(networkMessage);
    }

}