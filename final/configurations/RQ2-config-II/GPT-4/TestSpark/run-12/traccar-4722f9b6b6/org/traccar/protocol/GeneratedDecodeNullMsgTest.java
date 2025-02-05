package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.Protocol;

import java.net.InetSocketAddress;

public class GeneratedDecodeNullMsgTest {

    @Test
    public void decodeNullMsgTest() {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        InetSocketAddress address = new InetSocketAddress("localhost", 8080);

        try {
            Object decoded = decoder.decode(null, address, null);
            assertNull(decoded);
        } catch (Exception e) {
            fail("Exception should not have been thrown.");
        }
    }

}