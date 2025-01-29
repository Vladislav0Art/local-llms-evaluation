package org.traccar.protocol;

public class GeneratedTestDecodeNetwork {

    @Test
    public void testDecodeNetwork() {
        // Arrange
        Network network = null;
        SocketAddress remoteAddress = MockSocketAddress();
        Object msg = MockMessage();
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        Object result = WatchProtocolDecoder.decode(network, remoteAddress, msg);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}