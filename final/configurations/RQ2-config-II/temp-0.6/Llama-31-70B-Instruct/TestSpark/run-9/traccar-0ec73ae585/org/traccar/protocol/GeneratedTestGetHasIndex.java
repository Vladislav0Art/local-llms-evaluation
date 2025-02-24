package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);
        boolean hasIndex = watchProtocolDecoder.getHasIndex();
        assertEquals(true, hasIndex);
    }

}