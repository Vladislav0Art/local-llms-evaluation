package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.BaseProtocolDecoder;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);
        assertEquals(false, watchProtocolDecoder.getHasIndex());
    }

}