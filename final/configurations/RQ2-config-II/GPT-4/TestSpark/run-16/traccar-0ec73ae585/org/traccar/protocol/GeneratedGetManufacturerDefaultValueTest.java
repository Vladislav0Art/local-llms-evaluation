package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

public class GeneratedGetManufacturerDefaultValueTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void getManufacturerDefaultValueTest() {
        assertNull(decoder.getManufacturer());
    }

}