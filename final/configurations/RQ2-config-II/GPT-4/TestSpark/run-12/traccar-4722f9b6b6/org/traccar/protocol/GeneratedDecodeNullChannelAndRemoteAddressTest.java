package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.Protocol;

import java.net.InetSocketAddress;

public class GeneratedDecodeNullChannelAndRemoteAddressTest {

    @Test
    public void decodeNullChannelAndRemoteAddressTest() {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Object msg = "TestMsg";
        InetSocketAddress address = new InetSocketAddress("localhost", 8080);

        try {
            Object decoded = decoder.decode(null, address, msg);
            assertNull(decoded);
        } catch (Exception e) {
            fail("Exception should not have been thrown.");
        }
    }

}