package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        boolean result = decoder.getHasIndex();
        assertEquals(true, result);
    }

}