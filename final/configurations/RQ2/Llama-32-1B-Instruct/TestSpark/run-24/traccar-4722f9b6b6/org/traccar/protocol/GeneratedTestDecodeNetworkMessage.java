package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessage {

    @Test
    public void testDecodeNetworkMessage() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Network network = decoder.decode(Network.class, SocketAddress.inbound(0x10001));
        CellTower cellTower = decoder.decode(CellTower.class, SocketAddress.inbound(0x10002));
    }

}