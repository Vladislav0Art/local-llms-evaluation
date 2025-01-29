package org.traccar.protocol;

public class GeneratedTestDecodeHasIndex {

    @Test
    public void testDecodeHasIndex() {
        Protocol protocol = new Protocol();
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertTrue(decoder.getHasIndex());
    }

}