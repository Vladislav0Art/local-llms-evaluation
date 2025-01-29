package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertEquals("TRACCAR", decoder.getManufacturer());
    }

}