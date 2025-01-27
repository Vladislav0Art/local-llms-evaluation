package org.traccar.protocol;

public class GeneratedDecode_WatchResponse_ReturnsFalse {

    @Test
    public void decode_WatchResponse_ReturnsFalse() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertFalse(decoder.getHasIndex());
    }

}