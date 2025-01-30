package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTester;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedDecodeInitTest {

    @Test
    public void decodeInitTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

        assertNull(decoder.decode(null, null, "[3G*2000000867*000F*INIT,20160606040924]"));
    }

}