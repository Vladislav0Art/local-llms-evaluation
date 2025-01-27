package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchMessageHasNoIndexReturnsFalse {

    @Test
    public void decode_WatchMessageHasNoIndexReturnsFalse() throws Exception {
        // Given:
        boolean index = false;
        byte[] bytes = new byte[]{ /* Watch message without index */};
        Network network = new Network();
        DeviceSession session = new DeviceSession();

        // When & Then:
        assertFalse(WatchProtocolDecoder.decode(null, null, new Object()).getHasIndex());
    }

}