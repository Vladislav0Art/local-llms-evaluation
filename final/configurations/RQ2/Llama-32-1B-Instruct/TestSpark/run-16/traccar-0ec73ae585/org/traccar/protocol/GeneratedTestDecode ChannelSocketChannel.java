package org.traccar.protocol;

public class GeneratedTestDecode ChannelSocketChannel {

    @Test
    public void testDecode

    ChannelSocketChannel() {
        // Arrange
        Channel channel = new Channel(new Unpooled());
        SocketAddress remoteAddress = new SocketAddress(123, 456);
        Protocol protocol = mock(Protocol.class);

        // Act
        Object decodedObject = decoder.decode(channel, remoteAddress, null);

        // Assert
        verify(protocol).getHasIndex();
    }

}