package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchProtocol Decoder_ReturnsNullWhenDecodeFails {

    @Test
    public void decode_WatchProtocol

    Decoder_ReturnsNullWhenDecodeFails() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf data = Unpooled.buffer(20);

        // Act
        NetworkMessage networkMessage = (NetworkMessage) decoder.decode(null, null, data);

        // Assert
        assertNull(networkMessage);
    }

}