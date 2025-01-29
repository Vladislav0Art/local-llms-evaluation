package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.Watch);
        boolean hasIndex = decoder.getHasIndex();
        assertEquals(false, hasIndex);
    }

}