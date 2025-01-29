package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestWatchProtocolDecoderWithNullMessage {

    @Test
    public void testWatchProtocolDecoderWithNullMessage() {
        // Arrange
        byte[] message = null;

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertEquals(null, decoder.getManufacturer());
        assertEquals("watch", decoder.getManufacturer());

        // Act
        Object result = decoder.decode(message);

        // Assert
        assertNotNull(result);
    }

}