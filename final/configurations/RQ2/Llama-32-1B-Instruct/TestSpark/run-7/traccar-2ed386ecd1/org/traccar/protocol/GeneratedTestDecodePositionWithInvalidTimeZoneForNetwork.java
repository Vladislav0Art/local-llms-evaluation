package org.traccar.protocol;

public class GeneratedTestDecodePositionWithInvalidTimeZoneForNetwork {

    @Test
    public void testDecodePositionWithInvalidTimeZoneForNetwork() {
        // Arrange
        Network network = new Network();
        CellTower cellTower = new CellTower();

        // Act
        boolean result = Gt06ProtocolDecoder.decodeNetwork(network, cellTower, Unpooled.buffer(10), false, true, TimeZone.getTimeZone("America/New_York"));

        // Assert
        assertEquals(false, result);
    }

}