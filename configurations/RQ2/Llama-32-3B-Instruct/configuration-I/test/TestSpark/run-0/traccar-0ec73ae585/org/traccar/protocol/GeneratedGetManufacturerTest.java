package org.traccar.protocol;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertEquals("watch", decoder.getManufacturer());
    }

}