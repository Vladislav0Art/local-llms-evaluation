package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestWatchProtocolDecoderWithInvalidData {

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