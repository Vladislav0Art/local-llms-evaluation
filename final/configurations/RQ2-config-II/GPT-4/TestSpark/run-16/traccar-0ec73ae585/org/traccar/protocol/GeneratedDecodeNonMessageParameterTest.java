package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

public class GeneratedDecodeNonMessageParameterTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void decodeNonMessageParameterTest() throws Exception {
        assertNull(decoder.decode(null, new InetSocketAddress("localhost", 8080), null));
    }

}