package org.traccar.protocol;

public class GeneratedDecode_WatchProtocol_Match {

    @Test
    public void decode_WatchProtocol_Match() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x00); // Magic number 0x00

        // Act
        Object decodedObject = decoder.decode(null, null, buf);

        // Assert
        assertTrue(decodedObject instanceof NetworkMessage);
    }

}