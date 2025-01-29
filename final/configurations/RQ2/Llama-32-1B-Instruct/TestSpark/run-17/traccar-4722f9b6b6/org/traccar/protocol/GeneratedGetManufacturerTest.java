package org.traccar.protocol;

public class GeneratedGetManufacturerTest {

    private Protocol protocol;
    private Channel channel;

    @BeforeClass
    public static void setUp() throws Exception {
        protocol = new Protocol();
        channel = (Channel) Thread.currentThread().getContextClassLoader().loadClass("org.traccar.protocol.WatchProtocol").newInstance();
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String manufacturer = decoder.getManufacturer();
        assertEquals("Traccar", manufacturer);
    }

}