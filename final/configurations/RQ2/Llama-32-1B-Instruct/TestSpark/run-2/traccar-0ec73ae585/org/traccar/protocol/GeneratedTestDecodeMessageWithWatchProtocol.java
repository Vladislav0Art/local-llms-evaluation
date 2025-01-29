package org.traccar.protocol;

public class GeneratedTestDecodeMessageWithWatchProtocol {

    @Test
    public void testDecodeMessageWithWatchProtocol() throws Exception {
        // Arrange
        Channel channel = MockChannel();
        SocketAddress remoteAddress = MockSocketAddress();
        Object msg = MockMsg();
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act
        Object result = decoder.decode(channel, remoteAddress, msg);

        // Assert
        assertNotNull(result);
        assertEquals(1, ((Network) result).getNetwork().size());
    }

}