package org.traccar.protocol;

public class GeneratedDecode_WatchProtocol_MissingMagicNumber_Fail {

    @Test
    public void decode_WatchProtocol_MissingMagicNumber_Fail() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();

        // Act and Assert
        assertFalse(decoder.decode(null, null, buf) instanceof NetworkMessage);
    }

}