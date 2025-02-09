package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.Protocol;
import io.netty.buffer.Unpooled;

public class GeneratedGetManufacturerTest {

    Protocol protocol = new Protocol("testProtocol");

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("Unknown", decoder.getManufacturer());
    }

}