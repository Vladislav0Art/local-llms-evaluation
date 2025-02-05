package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.Protocol;

import java.net.InetSocketAddress;

public class GeneratedDecodeNullRemoteAddressTest {

    @Test
    public void decodeNullRemoteAddressTest() {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Object msg = "TestMsg";

        try {
            Object decoded = decoder.decode(null, null, msg);
            assertNull(decoded);
        } catch (Exception e) {
            fail("Exception should not have been thrown.");
        }
    }

}