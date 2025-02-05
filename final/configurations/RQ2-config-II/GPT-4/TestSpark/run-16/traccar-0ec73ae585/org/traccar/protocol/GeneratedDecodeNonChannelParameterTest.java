package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

public class GeneratedDecodeNonChannelParameterTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void decodeNonChannelParameterTest() throws Exception {
        assertNull(decoder.decode(null, new InetSocketAddress("localhost", 8080), "Message"));
    }

}