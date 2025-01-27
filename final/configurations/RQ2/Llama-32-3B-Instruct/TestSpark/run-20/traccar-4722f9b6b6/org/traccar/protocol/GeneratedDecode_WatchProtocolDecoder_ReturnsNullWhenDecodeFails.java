package org.traccar.protocol;

public class GeneratedDecode_WatchProtocolDecoder_ReturnsNullWhenDecodeFails {

    @Test
    public void decode_WatchProtocolDecoder_ReturnsNullWhenDecodeFails() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf data = Unpooled.buffer(20);

        // Act
        Object result = decoder.decode(null, null, data);

        // Assert
        assertNull(result);
    }

}