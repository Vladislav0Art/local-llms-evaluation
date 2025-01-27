package org.traccar.protocol;

public class GeneratedDecode_WatchProtocolDecoder_ReturnsCorrectDate {

    @Test
    public void decode_WatchProtocolDecoder_ReturnsCorrectDate() throws Exception {
        // Arrange
        WatchProtocolDealer decoder = new WatchProtocolDealer(Protocol.WATCH);
        ByteBuf data = Unpooled.buffer(100);
        data.writeBytes(new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06});

        // Act
        Object result = decoder.decode(null, null, data);

        // Assert
        assertNotNull(result);
    }

}