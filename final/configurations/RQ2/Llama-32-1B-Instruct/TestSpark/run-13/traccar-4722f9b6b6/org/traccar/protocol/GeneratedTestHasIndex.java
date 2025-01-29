package org.traccar.protocol;

public class GeneratedTestHasIndex {

    @Test
    public void testHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        boolean result = decoder.getHasIndex();
        assertTrue(result);
    }

}