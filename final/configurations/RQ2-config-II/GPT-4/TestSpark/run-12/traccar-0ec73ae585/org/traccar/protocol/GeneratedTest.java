package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.net.InetSocketAddress;
import java.net.ProtocolException;

public class GeneratedTest {

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void getHasIndexTrueTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void getHasIndexFalseTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("Manufacturer", decoder.getManufacturer());
    }

    @Test
    public void decodeNullMsgTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        InetSocketAddress remoteAddress = InetSocketAddress.createUnresolved("123.123.123.123", 5555);

        decoder.decode(null, remoteAddress, null);
    }

    @Test
    public void decodeInvalidMsgTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        InetSocketAddress remoteAddress = InetSocketAddress.createUnresolved("123.123.123.123", 5555);

        decoder.decode(null, remoteAddress, "Invalid");
    }

    @Test
    public void decodeValidMsgTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        InetSocketAddress remoteAddress = InetSocketAddress.createUnresolved("123.123.123.123", 5555);

        Object result = decoder.decode(null, remoteAddress, "Valid");

        assertNotNull(result);
    }

}