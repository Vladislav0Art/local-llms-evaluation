package org.traccar.protocol;

public class GeneratedDecode HasIndex {

    @Test
    public void decode

    HasIndex() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        // Act
        boolean result = decoder.decode(channel, remoteAddress, msg);

        // Assert
        Mockito.verify(channel).read(buf);
        Assertions.assertTrue(result);
    }

}