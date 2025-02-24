package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Before
    public void setup() {
        Protocol protocol = Mockito.mock(Protocol.class);
        watchProtocolDecoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void testGetHasIndex() {
        assertFalse(watchProtocolDecoder.getHasIndex());
    }

}