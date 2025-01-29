package org.traccar.protocol;

public class GeneratedTestDecodeChannel {

    @Test
    public void testDecodeChannel() {
        // Arrange
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = MockMessage();
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        Object result = WatchProtocolDecoder.decode(channel, remoteAddress, msg);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}