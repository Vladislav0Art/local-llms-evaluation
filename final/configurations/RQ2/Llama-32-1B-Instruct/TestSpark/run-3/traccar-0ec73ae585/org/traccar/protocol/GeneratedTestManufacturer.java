package org.traccar.protocol;

public class GeneratedTestManufacturer {

    @Test
    public void testManufacturer() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        expectAnyTimes(decoder.getManufacturer(), "Example Manufacturer");

        verifyAnyTimes(decoder.getManufacturer, () -> "Example Manufacturer");
    }

}