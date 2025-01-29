package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        String manufacturer = decoder.getManufacturer();
        assertEquals("Unknown", manufacturer);
    }

}