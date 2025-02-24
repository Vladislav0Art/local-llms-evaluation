package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecodeManufacturer {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void testDecodeManufacturer() {
        watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals("Watch", watchProtocolDecoder.getManufacturer());
    }

}