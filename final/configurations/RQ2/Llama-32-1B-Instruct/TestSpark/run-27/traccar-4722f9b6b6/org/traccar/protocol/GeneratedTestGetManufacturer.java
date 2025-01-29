package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        // Arrange
        Object[] args = new Object[0];
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        String result = WatchProtocolDecoder.decode(null, null, args);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}