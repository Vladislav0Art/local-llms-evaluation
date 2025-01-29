package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String manufacturer = decoder.getManufacturer();
        assertNotNull(manufacturer);
        assertEquals("TRACCA", manufacturer);
    }

}