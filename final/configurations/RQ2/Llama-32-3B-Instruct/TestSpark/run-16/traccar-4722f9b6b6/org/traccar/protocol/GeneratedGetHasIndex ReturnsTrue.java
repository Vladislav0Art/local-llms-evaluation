package org.traccar.protocol;

public class GeneratedGetHasIndex ReturnsTrue {

    @Test
    public void getHasIndex

    ReturnsTrue() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.INVALID);
        Object result = decoder.getHasIndex();

        // Act and Assert
        Assertions.assertTrue(result);
    }

}