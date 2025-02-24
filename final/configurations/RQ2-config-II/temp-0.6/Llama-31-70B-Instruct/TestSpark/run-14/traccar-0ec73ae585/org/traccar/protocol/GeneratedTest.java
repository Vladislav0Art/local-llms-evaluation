package org.traccar.protocol;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testWatchProtocolDecoderConstructor() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        assertEquals(protocol, decoder.getProtocol());
    }

}