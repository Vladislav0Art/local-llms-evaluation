package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolDecoderTest;
import org.traccar.ProtocolTest;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodePositionDataTest {

    public WatchProtocolDecoderTest() {
        super(new WatchProtocolDecoder(new Protocol("watch", 0)));
    }

    @Test
    public void decodePositionDataTest() {
        assertNotNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[3G*4700184321*00D4*UD,080520,053851,A,45.948567,N,6.132413,E,0.04,0.00,575.00,0,0,87,92,-11,4,9de4,E8216b4f80,150,-72,0f368dcf39,131,-70,WIFI!0b]")));
    }

}