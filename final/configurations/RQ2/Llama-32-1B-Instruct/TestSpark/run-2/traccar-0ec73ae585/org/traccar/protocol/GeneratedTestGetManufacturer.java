package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        // Arrange
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act
        String manufacturer = decoder.getManufacturer();

        // Assert
        assertEquals("TRAC-CAR", manufacturer);
    }

}