package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean hasIndex = decoder.getHasIndex();
        assertEquals(false, hasIndex); // This is just a placeholder to test the method without mocking
    }

}