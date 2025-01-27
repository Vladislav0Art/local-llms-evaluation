package org.traccar.protocol;

public class GeneratedTest {

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

    @Test
    public void decode_WatchProtocol_MissingMagicNumber_Fail() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();

        // Act and Assert
        assertFalse(decoder.decode(null, null, buf) instanceof NetworkMessage);
    }

    @Test
    public void decode_WatchProtocol_InvalidProtocol_Fail() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x00); // Magic number 0x01

        // Act and Assert
        assertFalse(decoder.decode(null, null, buf) instanceof NetworkMessage);
    }

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

    @Test
    public void decode_WatchProtocol_WifiAccessPoint_MissingData_Fail() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();

        // Act and Assert
        assertFalse(decoder.decode(null, null, buf) instanceof WifiAccessPoint);
    }

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

    @Test
    public void decode_WatchProtocol_CellularNetwork_MissingData_Fail() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();

        // Act and Assert
        assertFalse(decoder.decode(null, null, buf) instanceof CellTower);
    }

    @Test
    public void decode_WatchProtocol_Position_Match() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x00); // Magic number 0x02
        PatternBuilder patternBuilder = PatternBuilder.buildPattern().regex(".*");
        String position = "1234567890abcdef";
        Pattern regex = patternBuilder.getRegex();

        // Act
        Object decodedObject = decoder.decode(null, null, buf);

        // Assert
        assertTrue(decodedObject instanceof Position);
    }

    @Test
    public void decode_WatchProtocol_Position_MissingData_Fail() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();

        // Act and Assert
        assertFalse(decoder.decode(null, null, buf) instanceof Position);
    }

}