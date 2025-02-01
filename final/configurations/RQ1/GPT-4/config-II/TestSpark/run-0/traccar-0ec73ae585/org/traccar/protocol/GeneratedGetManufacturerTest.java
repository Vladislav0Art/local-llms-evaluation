package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Model.Protocol;
import org.traccar.Model.Position;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("protocol"));
        decoder.setManufacturer("Manufacturer");
        assertEquals("Manufacturer", decoder.getManufacturer());
    }

}