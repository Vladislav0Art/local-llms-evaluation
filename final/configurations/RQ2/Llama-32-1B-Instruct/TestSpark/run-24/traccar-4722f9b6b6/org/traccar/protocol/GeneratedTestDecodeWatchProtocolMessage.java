package org.traccar.protocol;

public class GeneratedTestDecodeWatchProtocolMessage {

    @Test
    public void testDecodeWatchProtocolMessage() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Network network = decoder.decode(Network.class, SocketAddress.inbound(0x8001));
        CellTower cellTower = decoder.decode(CellTower.class, SocketAddress.inbound(0x8002));
        WifiAccessPoint wifiAccessPoint = decoder.decode(WifiAccessPoint.class, SocketAddress.inbound(0x8003));
    }

}