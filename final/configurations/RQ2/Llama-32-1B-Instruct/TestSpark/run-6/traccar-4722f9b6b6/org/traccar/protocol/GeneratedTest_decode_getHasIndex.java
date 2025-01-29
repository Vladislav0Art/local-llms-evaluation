package org.traccar.protocol;

public class GeneratedTest_decode_getHasIndex {

    @Test
    public void test_decode_getHasIndex() {
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Assert.assertTrue(decoder.getHasIndex());
    }

}