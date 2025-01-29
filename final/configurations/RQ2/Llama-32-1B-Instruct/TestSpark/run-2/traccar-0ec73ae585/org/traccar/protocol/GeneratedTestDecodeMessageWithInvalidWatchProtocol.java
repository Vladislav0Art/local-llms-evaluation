package org.traccar.protocol;

public class GeneratedTestDecodeMessageWithInvalidWatchProtocol {

    @Test
    public void testDecodeMessageWithInvalidWatchProtocol() throws Exception {
        // Arrange
        Channel channel = MockChannel();
        SocketAddress remoteAddress = MockSocketAddress();
        Object msg = new Object();

        // Act
        Object result = decoder.decode(channel, remoteAddress, msg);

        // Assert
        assertNull(result);
    }

}