package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        // Arrange
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Act
        boolean hasIndex = decoder.getHasIndex();

        // Assert
        assertTrue(hasIndex);
    }

}