package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestWatchProtocolDecoder {

    @Test
    public void testWatchProtocolDecoder() {
        // Arrange
        byte[] message = new byte[]{1, 2};

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertEquals(null, decoder.getManufacturer());
        assertEquals("watch", decoder.getManufacturer());

        // Act
        Object result = decoder.decode(message);

        // Assert
        assertNotNull(result);
    }

}