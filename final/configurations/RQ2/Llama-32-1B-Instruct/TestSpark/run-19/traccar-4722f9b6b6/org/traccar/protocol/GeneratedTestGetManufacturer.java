package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

    private static final String DEVICE_ID = "1234567890";
    private static final SocketAddress REMOTE_ADDRESS = new SocketAddress("127.0.0.1", 8080);
    private Protocol protocol;
    private Channel channel;

    public void init() throws Exception {
        protocol = new Protocol();
        channel = channel();
    }

    @Test
    public void testGetManufacturer() {
        when(mockBaseProtocolDecoder.getManufacturer()).thenReturn("1234567890");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String manufacturer = decoder.getManufacturer();
        Assert.assertEquals("1234567890", manufacturer, "Expected getManufacturer to return 1234567890");
    }

}