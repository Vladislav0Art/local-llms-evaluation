package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchWatchMessageValidReturnsDecodedMessage {

    @Test
    public void decode_WatchWatchMessageValidReturnsDecodedMessage() throws Exception {
        // Given:
        byte[] bytes = new byte[]{ /* Watch message bytes */};
        Network network = new Network();
        DeviceSession session = new DeviceSession();

        // When:
        Object decodedMessage = WatchProtocolDecoder.decode(null, null, new Object());
        WatchMessage watchMessage = (WatchMessage) decodedMessage;

        // Then:
        assertNotNull(watchMessage);
    }

}