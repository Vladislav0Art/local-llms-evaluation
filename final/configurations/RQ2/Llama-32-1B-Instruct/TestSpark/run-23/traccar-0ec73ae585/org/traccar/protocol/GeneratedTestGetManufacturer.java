package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

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
    public void testGetManufacturer() {
        String manufacturer = decoder.getManufacturer();
        assertEquals("TRACCA", manufacturer);
    }

}