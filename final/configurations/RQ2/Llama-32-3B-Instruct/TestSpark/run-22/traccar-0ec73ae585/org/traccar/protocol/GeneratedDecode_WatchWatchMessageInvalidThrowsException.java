package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchWatchMessageInvalidThrowsException {

    @Test
    public void decode_WatchWatchMessageInvalidThrowsException() throws Exception {
        // Given:
        byte[] bytes = new byte[]{ /* Invalid message bytes */};
        Network network = new Network();
        DeviceSession session = new DeviceSession();

        // When & Then:
        assertThrows(Exception.class, () -> WatchProtocolDecoder.decode(null, null, new Object()));
    }

}