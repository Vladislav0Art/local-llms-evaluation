package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    private Protocol protocol;
    private Channel channel;
    private SocketAddress remoteAddress;

    @Before
    public void setUp() {
        // No setup needed for this test
    }

    @Test
    public void testGetHasIndex() {
        protocol = new Protocol();
        TestWatchProtocolDecoder decoder = new TestWatchProtocolDecoder(protocol);
        Object result = decoder.getHasIndex();
        assertEquals(false, result instanceof Boolean);
    }

}