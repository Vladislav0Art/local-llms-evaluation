package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

public class GeneratedDecodeAllNullParametersTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void decodeAllNullParametersTest() throws Exception {
        assertNull(decoder.decode(null, null, null));
    }

}