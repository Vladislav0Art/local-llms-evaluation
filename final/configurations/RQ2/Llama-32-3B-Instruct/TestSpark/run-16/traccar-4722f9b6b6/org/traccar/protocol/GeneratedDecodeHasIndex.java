package org.traccar.protocol;

public class GeneratedDecodeHasIndex {

    @Test
    public void decodeHasIndex() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.buffer();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = null;

        // Act and Assert
        boolean result = decoder.decode(channel, remoteAddress, msg);
        Mockito.verify(channel).read(buf);
        Assertions.assertTrue(result);
    }

}