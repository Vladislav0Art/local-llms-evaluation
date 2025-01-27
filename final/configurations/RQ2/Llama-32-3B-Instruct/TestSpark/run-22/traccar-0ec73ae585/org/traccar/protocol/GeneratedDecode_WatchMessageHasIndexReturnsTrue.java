package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchMessageHasIndexReturnsTrue {

    @Test
    public void decode_WatchMessageHasIndexReturnsTrue() throws Exception {
        // Given:
        boolean index = true;
        byte[] bytes = new byte[]{ /* Watch message with index */};
        Network network = new Network();
        DeviceSession session = new DeviceSession();

        // When & Then:
        assertTrue(WatchProtocolDecoder.decode(null, null, new Object()).getHasIndex());
    }

}