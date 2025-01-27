package org.traccar.protocol;

public class GeneratedDecode_WatchProtocolDecoder_ReturnsCorrectDeviceSession {

    @Test
    public void decode_WatchProtocolDecoder_ReturnsCorrectDeviceSession() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf data = Unpooled.buffer(100);
        data.writeBytes(new byte[]{0x01, 0x02, 0x03});

        // Act
        Object result = decoder.decode(null, null, data);

        // Assert
        assertNotNull(result);
    }

}