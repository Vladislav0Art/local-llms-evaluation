package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.Protocol;

import java.net.InetSocketAddress;

public class GeneratedGetManufacturerNullTest {

    @Test
    public void getManufacturerNullTest() {
        Protocol protocol = new Protocol("TestProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals(null, decoder.getManufacturer());
    }

}