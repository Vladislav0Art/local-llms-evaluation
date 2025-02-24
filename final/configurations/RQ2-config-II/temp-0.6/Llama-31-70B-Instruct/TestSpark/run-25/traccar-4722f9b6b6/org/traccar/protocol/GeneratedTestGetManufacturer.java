package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    private WatchProtocolDecoder protocolDecoder;

    @Before
    public void setUp() {
        Protocol protocol = new Protocol();
        protocolDecoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void testGetManufacturer() {
        assertNotNull(protocolDecoder.getManufacturer());
    }

}