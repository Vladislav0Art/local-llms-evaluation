package org.traccar.protocol;

public class GeneratedDecode_WatchProtocolDecoder_ReturnsCorrectWifiAccessPoint {

    @Test
    public void decode_WatchProtocolDecoder_ReturnsCorrectWifiAccessPoint() throws Exception {
        // Arrange
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH);
        ByteBuf data = Unpooled.buffer(100);
        data.writeBytes(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05});

        // Act
        Object result = decoder.decode(null, null, data);

        // Assert
        assertNotNull(result);
    }

}