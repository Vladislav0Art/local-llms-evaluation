package org.traccar.protocol;

public class GeneratedGetHasIndex_ReturnsFalse {

    @Test
    public void getHasIndex_ReturnsFalse() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act and Assert
        boolean result = decoder.getHasIndex();
        Assertions.assertFalse(result);
    }

}