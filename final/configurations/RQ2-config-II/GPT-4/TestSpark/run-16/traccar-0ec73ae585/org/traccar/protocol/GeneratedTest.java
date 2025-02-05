package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

public class GeneratedTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void getHasIndexDefaultValueTest() {
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerDefaultValueTest() {
        assertNull(decoder.getManufacturer());
    }

    @Test
    public void decodeNonChannelParameterTest() throws Exception {
        assertNull(decoder.decode(null, new InetSocketAddress("localhost", 8080), "Message"));
    }

    @Test
    public void decodeNonSocketAddressParameterTest() throws Exception {
        assertNull(decoder.decode(null, null, "Message"));
    }

    @Test
    public void decodeNonMessageParameterTest() throws Exception {
        assertNull(decoder.decode(null, new InetSocketAddress("localhost", 8080), null));
    }

    @Test
    public void decodeAllNullParametersTest() throws Exception {
        assertNull(decoder.decode(null, null, null));
    }

}