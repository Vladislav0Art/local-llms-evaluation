package org.traccar.protocol;

public class GeneratedTestDecodeCellTowerPosition {

    @Test
    public void testDecodeCellTowerPosition() {
        // Arrange
        Position position = null;
        SocketAddress remoteAddress = MockSocketAddress();
        CellTower cellTower = MockCellTower();
        Object msg = MockMessage();
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        Object result = WatchProtocolDecoder.decode(cellTower, remoteAddress, msg);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}