package org.traccar.protocol;

public class GeneratedGetHasIndex_ReturnsFalse_WithNullProtocol {

    public MockBaseProtocolDecoderTest() {
    }

    @Test
    public void getHasIndex_ReturnsFalse_WithNullProtocol() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertTrue(decoder.getHasIndex(), false);
    }

}