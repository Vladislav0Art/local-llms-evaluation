package org.traccar.protocol;

public class GeneratedTestDecodeBytes {

    @Test
    public void testDecodeBytes() {
        // Arrange
        ByteBuf bytes = Unpooled.buffer(1024);
        SocketAddress remoteAddress = null;
        Object msg = MockMessage();
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        Object result = WatchProtocolDecoder.decode(bytes, remoteAddress, msg);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}