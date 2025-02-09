package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Context;

public class GeneratedGetManufacturerTest {

    // creates a new WatchProtocolDecoder object with specified protocol

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol"));
        assertNull(decoder.getManufacturer());

        // setManufacturer is a mock method to simulate setting the manufacturer property
        decoder.setManufacturer("testManufacturer");

        assertEquals("testManufacturer", decoder.getManufacturer());
    }

}