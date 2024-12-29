package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    private Protocol protocol;
    private Channel channel;
    private SocketAddress remoteAddress;

    @Before
    public void setUp() {
        // No setup needed for this test
    }

    @Test
    public void testGetManufacturer() {
        protocol = new Protocol();
        TestWatchProtocolDecoder decoder = new TestWatchProtocolDecoder(protocol);
        Object result = decoder.getManufacturer();
        assertNotNull(result);
        assertEquals("TRACCA", result.toString());
    }

}