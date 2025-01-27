package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchProtocol Decoder_ReturnsCorrectWifiAccessPoint {

    @Test
    public void decode_WatchProtocol

    Decoder_ReturnsCorrectWifiAccessPoint() throws Exception {
        // Arrange
        ByteBuf data = Unpooled.buffer(90);
        data.writeBytes(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x10});
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act
        WifiAccessPoint wifiAccessPoint = (WifiAccessPoint) decoder.decode(null, null, data);

        // Assert
        assertNotNull(wifiAccessPoint);
    }

}