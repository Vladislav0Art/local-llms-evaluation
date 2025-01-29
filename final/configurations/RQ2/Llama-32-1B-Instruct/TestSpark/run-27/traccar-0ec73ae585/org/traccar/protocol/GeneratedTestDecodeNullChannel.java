package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDecodeNullChannel {

    @Test
    public void testDecodeNullChannel() {
        MockWatchProtocolDecoder mockDecode = new MockWatchProtocolDecoder();
        Channel channel = null;
        assertFalse(mockDecode.decode(channel, "UnknownAddress", null));
    }

}