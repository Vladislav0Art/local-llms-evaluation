package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void testDecodeHasIndexTrue() {
        watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals(true, watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void testDecodeHasIndexFalse() {
        watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals(false, watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void testDecodeManufacturer() {
        watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals("Watch", watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void testDecode() {
        watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals("", watchProtocolDecoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), ""));
    }

}