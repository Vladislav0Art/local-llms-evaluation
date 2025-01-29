package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertEquals("Unknown", decoder.getManufacturer());
    }

}