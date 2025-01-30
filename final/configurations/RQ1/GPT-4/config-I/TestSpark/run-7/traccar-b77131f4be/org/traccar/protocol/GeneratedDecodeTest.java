package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.GalileoProtocolDecoder;
import io.netty.buffer.Unpooled;

import static org.junit.Assert.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);
        assertNull(decoder.decode(null, null, Unpooled.buffer()));
    }

}