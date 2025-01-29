package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    private BaseProtocolDecoder baseProtocolDecoder;

    @Test
    public void testGetManufacturer() throws Exception {
        // Set up mock protocol decoder
        MockWatchProtocolDecoder mockWatchProtocolDecoder = new MockWatchProtocolDecoder();
        baseProtocolDecoder = mockWatchProtocolDecoder;

        // Call getManufacturer method with a specific message and verify the result
        Assert.assertEquals("Mock Manufacturer", baseProtocolDecoder.getManufacturer(true));
    }

}