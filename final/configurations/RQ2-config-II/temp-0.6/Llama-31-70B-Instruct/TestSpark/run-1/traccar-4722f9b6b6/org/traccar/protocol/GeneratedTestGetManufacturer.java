package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder();

    @Test
    public void testGetManufacturer() {
        assertEquals("Watch", decoder.getManufacturer());
    }

}