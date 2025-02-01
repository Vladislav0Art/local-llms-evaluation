package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolDecoderTest;
import org.traccar.ProtocolTest;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodePositionDataErrorTest {

    public WatchProtocolDecoderTest() {
        super(new WatchProtocolDecoder(new Protocol("watch", 0)));
    }

    @Test
    public void decodePositionDataErrorTest() {
        assertNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[CS*123456789012345*LK,8,100]")));
    }

}