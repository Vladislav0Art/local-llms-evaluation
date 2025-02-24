package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals("", decoder.getManufacturer());
    }

}