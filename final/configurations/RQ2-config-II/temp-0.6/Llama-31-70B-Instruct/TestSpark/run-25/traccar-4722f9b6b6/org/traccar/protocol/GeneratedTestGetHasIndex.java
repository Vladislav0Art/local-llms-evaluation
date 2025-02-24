package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    private WatchProtocolDecoder protocolDecoder;

    @Before
    public void setUp() {
        Protocol protocol = new Protocol();
        protocolDecoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void testGetHasIndex() {
        assertFalse(protocolDecoder.getHasIndex());
    }

}