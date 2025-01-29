package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    private BaseProtocolDecoder baseProtocolDecoder;

    @Test
    public void testGetHasIndex() throws Exception {
        // Set up mock protocol decoder
        MockWatchProtocolDecoder mockWatchProtocolDecoder = new MockWatchProtocolDecoder();
        baseProtocolDecoder = mockWatchProtocolDecoder;

        // Call getHasIndex method with a specific message and verify the result
        Assert.assertTrue(baseProtocolDecoder.getHasIndex(true));
    }

}