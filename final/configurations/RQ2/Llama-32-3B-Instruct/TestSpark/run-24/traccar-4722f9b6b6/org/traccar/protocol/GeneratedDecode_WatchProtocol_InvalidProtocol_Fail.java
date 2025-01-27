package org.traccar.protocol;

public class GeneratedDecode_WatchProtocol_InvalidProtocol_Fail {

    @Test
    public void decode_WatchProtocol_InvalidProtocol_Fail() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x00); // Magic number 0x01

        // Act and Assert
        assertFalse(decoder.decode(null, null, buf) instanceof NetworkMessage);
    }

}