package org.traccar.protocol;

public class GeneratedTestDecodeWatchProtocol {

    @Test
    public void testDecodeWatchProtocol() {
        // Arrange
        SocketAddress remoteAddress = MockSocketAddress();
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        Object result = WatchProtocolDecoder.decode(remoteAddress, null);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}