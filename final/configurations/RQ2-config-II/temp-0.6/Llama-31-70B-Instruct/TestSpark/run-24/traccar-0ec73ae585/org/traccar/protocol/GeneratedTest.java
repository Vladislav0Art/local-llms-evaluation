package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertEquals(true, decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertEquals("Watch", decoder.getManufacturer());
    }

    @Test
    public void decodeTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        Position position = (Position) decoder.decode(null, null, null);
        assertEquals(null, position);
    }

}