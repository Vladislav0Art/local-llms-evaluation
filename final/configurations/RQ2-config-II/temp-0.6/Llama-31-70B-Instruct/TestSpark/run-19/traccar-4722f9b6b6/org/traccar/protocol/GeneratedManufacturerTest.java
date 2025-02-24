package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedManufacturerTest {

    private WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void manufacturerTest() {
        assertNotNull(watchProtocolDecoder.getManufacturer());
    }

}