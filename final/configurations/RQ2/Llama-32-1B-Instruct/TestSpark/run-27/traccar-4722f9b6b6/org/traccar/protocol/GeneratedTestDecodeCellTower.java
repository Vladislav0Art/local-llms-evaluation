package org.traccar.protocol;

public class GeneratedTestDecodeCellTower {

    @Test
    public void testDecodeCellTower() {
        // Arrange
        CellTower cellTower = null;
        SocketAddress remoteAddress = MockSocketAddress();
        Object msg = MockMessage();
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        Object result = WatchProtocolDecoder.decode(cellTower, remoteAddress, msg);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}