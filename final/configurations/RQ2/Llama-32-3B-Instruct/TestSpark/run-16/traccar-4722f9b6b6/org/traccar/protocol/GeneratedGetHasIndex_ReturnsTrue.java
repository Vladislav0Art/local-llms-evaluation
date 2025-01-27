package org.traccar.protocol;

public class GeneratedGetHasIndex_ReturnsTrue {

    @Test
    public void getHasIndex_ReturnsTrue() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.INVALID);

        // Act and Assert
        boolean result = decoder.getHasIndex();
        Assertions.assertTrue(result);
    }

}