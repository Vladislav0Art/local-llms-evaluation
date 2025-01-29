package org.traccar.protocol;

public class GeneratedTestDecodeChannelChannelSocketAddress {

    @Test
    public void testDecodeChannelChannelSocketAddress() {
        // Arrange
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        Object decodedObject = decoder.decode(channel, remoteAddress, null);

        // Assert
        verify(protocol).getHasIndex(decodedObject instanceof Position ? (Position) decodedObject : null);
    }

}