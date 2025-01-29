package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() throws Exception {
        Position position = new Position(42.2132132, -71.1234567);
        Network network = createNetwork("NetworkName", 1000);
        CellTower cellTower = createCellTower(network, 500);
        DeviceSession deviceSession = createDeviceSession(cellTower, "DeviceID");

        Protocol protocol = new Protocol();
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertTrue(decoder.decode(channel, null, position) instanceof Position);
    }

}