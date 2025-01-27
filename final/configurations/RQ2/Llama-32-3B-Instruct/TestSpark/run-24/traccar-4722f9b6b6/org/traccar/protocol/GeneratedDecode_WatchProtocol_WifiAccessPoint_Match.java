package org.traccar.protocol;

public class GeneratedDecode_WatchProtocol_WifiAccessPoint_Match {

    @Test
    public void decode_WatchProtocol_WifiAccessPoint_Match() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x00); // Magic number 0x00
        PatternBuilder patternBuilder = PatternBuilder.buildPattern().regex(".*");
        String wifiAccessPoint = "1234567890abcdef";
        Pattern regex = patternBuilder.getRegex();

        // Act
        Object decodedObject = decoder.decode(null, null, buf);

        // Assert
        assertTrue(decodedObject instanceof WifiAccessPoint);
    }

}