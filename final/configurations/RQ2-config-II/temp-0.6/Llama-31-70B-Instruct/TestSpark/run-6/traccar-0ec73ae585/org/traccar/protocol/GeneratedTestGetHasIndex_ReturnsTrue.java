package org.traccar.protocol;

public class GeneratedTestGetHasIndex_ReturnsTrue {

    // Tests for getHasIndex() method

    @Test
    public void testGetHasIndex_ReturnsTrue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertTrue(decoder.getHasIndex());
    }

}