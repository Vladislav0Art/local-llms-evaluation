package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchWatchMessageValidReturns decodedMessage {

    @Test
    public void decode_WatchWatchMessageValidReturns

    decodedMessage() throws Exception {
        // Given:
        byte[] bytes = new byte[]{ /* Watch message bytes */};
        Network network = new Network();
        DeviceSession session = new DeviceSession();

        // When:
        Object obj = WatchProtocolDecoder.class.newInstance().decode(null, null, new Object());
        WatchMessage watchMessage = (WatchMessage) obj;

        // Then:
        assertNotNull(watchMessage);
    }

}