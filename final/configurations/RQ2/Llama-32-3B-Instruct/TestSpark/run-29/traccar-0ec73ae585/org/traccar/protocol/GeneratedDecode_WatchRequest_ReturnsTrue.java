package org.traccar.protocol;

public class GeneratedDecode_WatchRequest_ReturnsTrue {

    @Test
    public void decode_WatchRequest_ReturnsTrue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertTrue(decoder.getHasIndex());
    }

}