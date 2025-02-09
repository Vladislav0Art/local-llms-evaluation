package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.Protocol;
import io.netty.buffer.Unpooled;

public class GeneratedTest {

    Protocol protocol = new Protocol("testProtocol");

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("Unknown", decoder.getManufacturer());
    }

    @Test
    public void decodeTestNull() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decode(null, null, null));
    }

    @Test
    public void decodeTestEmptyBuffer() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decode(null, null, Unpooled.buffer(0)));
    }

    @Test
    public void decodeTestInvalidMsgType() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decode(null, null, "WrongType"));
    }

    @Test
    public void decodeTestBufferWithData() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decode(null, null, Unpooled.wrappedBuffer(new byte[]{1, 2, 3})));
    }

}