package org.traccar.protocol;

public class GeneratedTestGetManufacturer_ReturnsManufacturer {

    // Tests for getHasIndex() method

    @Test
    public void testGetManufacturer_ReturnsManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertEquals("Manufacturer", decoder.getManufacturer());
    }

}