package org.traccar.protocol;

public class GeneratedGetHasIndex ReturnsFalse {

    @Test
    public void getHasIndex

    ReturnsFalse() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Object result = decoder.getHasIndex();

        // Act and Assert
        Assertions.assertFalse(result);
    }

}