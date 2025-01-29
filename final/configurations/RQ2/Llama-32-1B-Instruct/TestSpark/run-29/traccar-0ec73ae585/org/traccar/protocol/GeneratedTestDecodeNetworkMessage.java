package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessage {

    @Test
    public void testDecodeNetworkMessage() throws Exception {
        Network network = createNetwork("NetworkName", 1000);
        CellTower cellTower = createCellTower(network, 500);
        DeviceSession deviceSession = createDeviceSession(cellTower, "DeviceID");
        NetworkMessage message = createNetworkMessage(1, network, new Position(40.2132132, -71.1234567));

        Protocol protocol = new Protocol();
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertTrue(decoder.decode(channel, null, message) instanceof NetworkMessage);
    }

}