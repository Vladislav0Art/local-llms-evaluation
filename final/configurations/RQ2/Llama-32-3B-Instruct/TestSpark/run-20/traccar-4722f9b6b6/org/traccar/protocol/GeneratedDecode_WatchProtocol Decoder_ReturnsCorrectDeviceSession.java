package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchProtocol Decoder_ReturnsCorrectDeviceSession {

    @Test
    public void decode_WatchProtocol

    Decoder_ReturnsCorrectDeviceSession() throws Exception {
        // Arrange
        ByteBuf data = Unpooled.buffer(50);
        data.writeBytes(new byte[]{0x01, 0x02, 0x03, 0x04});
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act
        DeviceSession deviceSession = (DeviceSession) decoder.decode(null, null, data);

        // Assert
        assertNotNull(deviceSession);
    }

}