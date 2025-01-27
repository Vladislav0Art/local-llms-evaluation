package org.traccar.protocol;

public class GeneratedGetManufacturer_WatchManufacturer_ReturnsCorrectValue {

    @Test
    public void getManufacturer_WatchManufacturer_ReturnsCorrectValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertEquals("Watch", decoder.getManufacturer());
    }

}