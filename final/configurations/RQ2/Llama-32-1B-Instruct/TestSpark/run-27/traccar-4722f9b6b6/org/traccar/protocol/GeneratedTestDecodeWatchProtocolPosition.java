package org.traccar.protocol;

public class GeneratedTestDecodeWatchProtocolPosition {

    @Test
    public void testDecodeWatchProtocolPosition() {
        // Arrange
        SocketAddress remoteAddress = MockSocketAddress();
        CellTower cellTower = MockCellTower();
        Position position = null;
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        Object result = WatchProtocolDecoder.decode(cellTower, remoteAddress);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}