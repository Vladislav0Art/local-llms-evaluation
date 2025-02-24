package org.traccar.protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(mock(Protocol.class));
        assertNotNull(watchProtocolDecoder);
    }

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(mock(Protocol.class));
        assertTrue(watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(mock(Protocol.class));
        assertEquals("Watch", watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(mock(Protocol.class));
        assertNull(watchProtocolDecoder.decode(mock(Channel.class), mock(SocketAddress.class), ""));
    }

}