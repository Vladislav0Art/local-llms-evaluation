package org.traccar.protocol;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void watchProtocolDecoderConstructorTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void getHasIndexTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("", decoder.getManufacturer());
    }

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.decode(null, null, null);
    }

}