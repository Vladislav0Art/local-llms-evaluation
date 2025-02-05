package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.Protocol;

import java.net.InetSocketAddress;

public class GeneratedTest {

    @Test
    public void WatchProtocolDecoderConstructorBasicInputsTest() {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void getManufacturerNullTest() {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals(null, decoder.getManufacturer());
    }

    @Test
    public void getHasIndexNullTest() {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertFalse(decoder.getHasIndex());
    }

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