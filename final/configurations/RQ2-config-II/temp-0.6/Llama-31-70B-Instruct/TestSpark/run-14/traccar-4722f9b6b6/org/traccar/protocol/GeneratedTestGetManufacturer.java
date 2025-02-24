package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.BaseProtocolDecoder;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);
        assertEquals("watch", watchProtocolDecoder.getManufacturer());
    }

}