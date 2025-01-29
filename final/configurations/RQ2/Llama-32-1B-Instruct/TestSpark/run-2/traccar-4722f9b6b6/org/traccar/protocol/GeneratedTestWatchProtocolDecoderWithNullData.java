package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestWatchProtocolDecoderWithNullData {

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

}