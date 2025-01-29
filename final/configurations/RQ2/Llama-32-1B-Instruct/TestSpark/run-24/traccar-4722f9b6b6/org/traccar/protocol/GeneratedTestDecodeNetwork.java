package org.traccar.protocol;

public class GeneratedTestDecodeNetwork {

    @Test
    public void testDecodeNetwork() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Network network = decoder.decode(Network.class, SocketAddress.inbound(0x0002));
        Assert.assertNotNull(network);
    }

}