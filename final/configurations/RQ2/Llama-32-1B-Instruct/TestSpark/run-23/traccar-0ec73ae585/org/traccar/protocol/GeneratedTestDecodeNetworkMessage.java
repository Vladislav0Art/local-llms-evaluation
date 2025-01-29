package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessage {

    private static Protocol protocol;
    private static BaseProtocolDecoder decoder;

    @Before
    public void setup() {
        // Setup the Netty channel for testing
        Channel channel = nettyChannel();
        SocketAddress remoteAddress = channel.randomRemoteSocketAddress();
        Object msg = createNetworkMessage();

        // Create a WatchProtocolDecoder instance and set its protocol
        decoder = new WatchProtocolDecoder(protocol);
        decoder.protocol = protocol;
    }

    @Test
    public void testDecodeNetworkMessage() throws Exception {
        Object decodedMessage = decoder.decode(
                Channel.class,
                SocketAddress.class,
                new NetworkMessage()
        );
        assertEquals(123, (Integer) decodedMessage);

        Network network = decoder.decode(Network.class, null, null);
        assertNotNull(network);
        assertEquals("New York", network.getCity());
    }

}