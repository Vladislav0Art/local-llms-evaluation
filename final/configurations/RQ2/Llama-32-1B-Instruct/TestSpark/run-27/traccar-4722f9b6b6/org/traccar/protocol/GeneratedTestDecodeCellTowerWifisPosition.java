package org.traccar.protocol;

public class GeneratedTestDecodeCellTowerWifisPosition {

    @Test
    public void testDecodeCellTowerWifisPosition() {
        // Arrange
        WifiAccessPoint wifiAccessPoint = null;
        SocketAddress remoteAddress = MockSocketAddress();
        CellTower cellTower = MockCellTower();
        Position position = null;
        Object msg = MockMessage();
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        Object result = WatchProtocolDecoder.decode(cellTower, remoteAddress, msg);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}