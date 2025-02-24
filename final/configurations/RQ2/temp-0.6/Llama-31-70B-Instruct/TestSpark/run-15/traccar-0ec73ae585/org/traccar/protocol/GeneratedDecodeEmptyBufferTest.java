package org.traccar.protocol;

import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

public class GeneratedDecodeEmptyBufferTest {

    @Test
    public void decodeEmptyBufferTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Object result = decoder.decode(null, null, Unpooled.EMPTY_BUFFER);
        assertNull(result);
    }

}