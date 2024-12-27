package org.traccar.protocol;

public class GeneratedGetHasIndexFalseTest {

    @Test
    public void getHasIndexFalseTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.OTHER);
        assertFalse(decoder.getHasIndex());
    }

}