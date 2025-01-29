package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessage {

    @Test
    public void testDecodeNetworkMessage() {
        Network network = MockNetwork.create();
        CellTower cellTower = MockCellTower.create();
        WifiAccessPoint wifiAccessPoint = MockWifiAccessPoint.create();
        Position position = MockPosition.create(cellTower, wifiAccessPoint);
        NetworkMessage networkMessage = MockNetworkMessage.create(network, position);
        String encodedMessage = encodeString(networkMessage.toString());
        assertEquals(1024, encodedMessage.length(), 0);
        Object decodedMessage;
        try {
            decodedMessage = decoder.decode(MockChannel.createSocketChannel(), MockSocketAddress.create(null), encodedMessage);
        } catch (Exception e) {
            return;
        }
        assertNotNull(decodedMessage);
        assertTrue(decodedMessage instanceof String);
    }

}