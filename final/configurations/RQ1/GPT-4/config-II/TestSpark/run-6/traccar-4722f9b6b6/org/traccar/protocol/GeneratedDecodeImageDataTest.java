package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolDecoderTest;
import org.traccar.ProtocolTest;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeImageDataTest {

    public WatchProtocolDecoderTest() {
        super(new WatchProtocolDecoder(new Protocol("watch", 0)));
    }

    @Test
    public void decodeImageDataTest() {
        assertNotNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[YW*4700184321*00F6*IMG,1F10,0,2,E8216b4f80,150,-72,0f368dcf39,131,-70,WIFI!0b]")));
    }

}