package org.traccar.protocol;

public class GeneratedTestDecode_WatchProtocol_NullMessage {

    @Test
    public void testDecode_WatchProtocol_NullMessage() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        assertNull(decoder.decode(null, null, null));
    }

}