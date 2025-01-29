package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessage {

    @Test
    public void testDecodeNetworkMessage() {
        // Arrange
        Network network = new Network();
        CellTower cellTower = new CellTower();
        Position position = new Position(37.7749, -122.4194);

        // Act
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("Gt06"));
        boolean result = decoder.decodeNetwork(network, cellTower, position, false, true, TimeZone.getTimeZone("America/New_York"));

        // Assert
        assertEquals(true, result);
    }

}