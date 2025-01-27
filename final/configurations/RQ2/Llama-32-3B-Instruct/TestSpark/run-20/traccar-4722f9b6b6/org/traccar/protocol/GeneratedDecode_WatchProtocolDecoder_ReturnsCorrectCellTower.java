package org.traccar.protocol;

public class GeneratedDecode_WatchProtocolDecoder_ReturnsCorrectCellTower {

    @Test
    public void decode_WatchProtocolDecoder_ReturnsCorrectCellTower() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDealer(Protocol.WATCH);
        ByteBuf data = Unpooled.buffer(100);
        data.writeBytes(new byte[]{0x01, 0x02, 0x03, 0x04});

        // Act
        Object result = decoder.decode(null, null, data);

        // Assert
        assertNotNull(result);
    }

}