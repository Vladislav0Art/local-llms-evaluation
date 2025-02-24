package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertEquals("Watch", decoder.getManufacturer());
    }

}