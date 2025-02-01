package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolDecoderTest;
import org.traccar.ProtocolTest;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeInitializationTest {

    public WatchProtocolDecoderTest() {
        super(new WatchProtocolDecoder(new Protocol("watch", 0)));
    }

    @Test
    public void decodeInitializationTest() {
        assertNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[YW*4700184321*0002*INIT]")));
    }

}