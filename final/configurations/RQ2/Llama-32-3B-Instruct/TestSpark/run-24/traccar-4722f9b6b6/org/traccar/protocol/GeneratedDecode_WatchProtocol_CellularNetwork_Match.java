package org.traccar.protocol;

public class GeneratedDecode_WatchProtocol_CellularNetwork_Match {

    @Test
    public void decode_WatchProtocol_CellularNetwork_Match() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x00); // Magic number 0x01
        PatternBuilder patternBuilder = PatternBuilder.buildPattern().regex(".*");
        String cellularNetwork = "1234567890abcdef";
        Pattern regex = patternBuilder.getRegex();

        // Act
        Object decodedObject = decoder.decode(null, null, buf);

        // Assert
        assertTrue(decodedObject instanceof CellTower);
    }

}