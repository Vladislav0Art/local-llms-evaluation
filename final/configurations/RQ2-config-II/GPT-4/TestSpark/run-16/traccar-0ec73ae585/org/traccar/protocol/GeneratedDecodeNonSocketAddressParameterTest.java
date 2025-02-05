package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

public class GeneratedDecodeNonSocketAddressParameterTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void decodeNonSocketAddressParameterTest() throws Exception {
        assertNull(decoder.decode(null, null, "Message"));
    }

}