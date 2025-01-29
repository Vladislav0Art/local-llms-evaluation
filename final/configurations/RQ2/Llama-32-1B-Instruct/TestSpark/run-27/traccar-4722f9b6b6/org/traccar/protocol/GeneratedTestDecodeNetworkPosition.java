package org.traccar.protocol;

public class GeneratedTestDecodeNetworkPosition {

    @Test
    public void testDecodeNetworkPosition() {
        // Arrange
        Position position = null;
        SocketAddress remoteAddress = MockSocketAddress();
        Object msg = MockMessage();
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        Object result = WatchProtocolDecoder.decode(position, remoteAddress, msg);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}