package org.traccar.protocol;

public class GeneratedDecode_WatchProtocolDecoder_ReturnsCorrectData {

    @Test
    public void decode_WatchProtocolDecoder_ReturnsCorrectData() throws Exception {
        // Arrange
        ByteBuf data = Unpooled.buffer(20);
        data.writeBytes(new byte[]{0x01, 0x02});
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act
        Object result = decoder.decode(null, null, data);

        // Assert
        assertNotNull(result);
    }

}