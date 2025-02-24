package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Before
    public void setup() {
        Protocol protocol = Mockito.mock(Protocol.class);
        watchProtocolDecoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void testGetManufacturer() {
        assertEquals("Watch", watchProtocolDecoder.getManufacturer());
    }

}