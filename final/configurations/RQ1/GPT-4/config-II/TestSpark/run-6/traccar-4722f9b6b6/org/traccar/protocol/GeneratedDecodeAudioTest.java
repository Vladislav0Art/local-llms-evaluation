package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolDecoderTest;
import org.traccar.ProtocolTest;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeAudioTest {

    public WatchProtocolDecoderTest() {
        super(new WatchProtocolDecoder(new Protocol("watch", 0)));
    }

    @Test
    public void decodeAudioTest() {
        assertNotNull(decoder.decode(null, null, StandardCharsets.US_ASCII.encode("[YW*4700184321*016C*TK,1,1,8000,1,4,00029CA8,29A8,C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2C1B2]")));
    }

}