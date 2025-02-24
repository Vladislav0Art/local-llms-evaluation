package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals("Watch", watchProtocolDecoder.getManufacturer());
    }

}