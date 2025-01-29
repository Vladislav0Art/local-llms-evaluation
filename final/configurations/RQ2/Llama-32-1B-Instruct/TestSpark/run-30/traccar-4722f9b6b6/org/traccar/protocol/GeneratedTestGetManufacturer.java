package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertEquals("TRACCA", decoder.getManufacturer());
    }

}