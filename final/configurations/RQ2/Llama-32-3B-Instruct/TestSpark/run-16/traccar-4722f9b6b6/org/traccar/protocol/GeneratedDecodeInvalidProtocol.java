package org.traccar.protocol;

public class GeneratedDecodeInvalidProtocol {

    @Test
    public void decodeInvalidProtocol() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.INVALID);
        ByteBuf buf = Unpooled.buffer();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = null;

        // Act and Assert
        Assertions.assertFalse(decoder.decode(channel, remoteAddress, msg));
    }

}