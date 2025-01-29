package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        // Arrange
        Object[] args = new Object[0];
        Protocol protocol = MockProtocol.INSTANCE;

        // Act
        boolean result = WatchProtocolDecoder.decode(null, null, args);

        // Assert
        assertTrue(WatchProtocolDecoder.class.isAssignableFrom(result.getClass()));
    }

}