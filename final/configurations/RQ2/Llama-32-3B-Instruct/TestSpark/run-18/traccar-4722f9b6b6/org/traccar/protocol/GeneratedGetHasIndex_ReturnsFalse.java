package org.traccar.protocol;

public class GeneratedGetHasIndex_ReturnsFalse {

    @Test
    public void getHasIndex_ReturnsFalse() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WatchProtocols);
        boolean result = decoder.getHasIndex();
        Assert.assertFalse(result);
    }

}