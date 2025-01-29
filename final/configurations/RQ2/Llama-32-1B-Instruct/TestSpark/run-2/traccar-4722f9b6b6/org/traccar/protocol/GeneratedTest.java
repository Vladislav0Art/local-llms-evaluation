package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTest {

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

    @Test
    public void testWatchProtocolDecoderWithNullData() {
        // Arrange
        byte[] message = new byte[]{1, 2};
        message[0] = null;

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act and Assert
        Object result = decoder.decode(message);
        assertNotNull(result);
    }

    @Test
    public void testWatchProtocolDecoderWithInvalidData() {
        // Arrange
        byte[] message = new byte[]{1, 2};
        message[0] = (byte) 'a';

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // Act and Assert
        assertNull(decoder.decode(message));
    }

}