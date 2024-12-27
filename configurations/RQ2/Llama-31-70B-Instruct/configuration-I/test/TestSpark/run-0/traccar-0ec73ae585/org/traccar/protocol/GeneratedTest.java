package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertTrue(watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals("Watch", watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertNull(watchProtocolDecoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), "test"));
    }

}