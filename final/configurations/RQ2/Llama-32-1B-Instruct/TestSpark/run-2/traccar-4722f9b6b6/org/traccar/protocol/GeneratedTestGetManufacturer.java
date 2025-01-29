package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        String manufacturer = decoder.getManufacturer();
        assertTrue(manager != null && !manufacturer.isEmpty());
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

}