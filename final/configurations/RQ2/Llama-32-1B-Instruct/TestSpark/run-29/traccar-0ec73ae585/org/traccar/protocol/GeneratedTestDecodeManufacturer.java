package org.traccar.protocol;

public class GeneratedTestDecodeManufacturer {

    @Test
    public void testDecodeManufacturer() {
        Protocol protocol = new Protocol();
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("Traccar", decoder.getManufacturer());
    }

}