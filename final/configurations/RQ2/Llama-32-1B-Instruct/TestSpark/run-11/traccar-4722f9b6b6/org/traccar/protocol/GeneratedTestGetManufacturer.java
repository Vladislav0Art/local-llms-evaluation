package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.Watch);
        String manufacturer = decoder.getManufacturer();
        assertNotNull(manufacturer);
        assertEquals("Traccar", manufacturer);
    }

}