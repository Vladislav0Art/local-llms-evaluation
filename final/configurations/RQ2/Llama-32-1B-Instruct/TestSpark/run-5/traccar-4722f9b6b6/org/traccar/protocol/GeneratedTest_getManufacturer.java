package org.traccar.protocol;

public class GeneratedTest_getManufacturer {

    @Test
    public void test_getManufacturer() {
        String manufacturer = "Traccar";
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WatchProtocol);
        assertEquals(manufacturer, decoder.getManufacturer());
    }

}