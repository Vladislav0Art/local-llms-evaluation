package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchProtocol Decoder_ReturnsCorrectDate {

    @Test
    public void decode_WatchProtocol

    Decoder_ReturnsCorrectDate() throws Exception {
        // Arrange
        ByteBuf data = Unpooled.buffer(100);
        data.writeBytes(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x10, 0x00, 0x11});
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act
        Date date = (Date) decoder.decode(null, null, data);

        // Assert
        assertNotNull(date);
    }

}