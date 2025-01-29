package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    private static final String DEVICE_ID = "1234567890";
    private static final SocketAddress REMOTE_ADDRESS = new SocketAddress("127.0.0.1", 8080);
    private Protocol protocol;
    private Channel channel;

    public void init() throws Exception {
        protocol = new Protocol();
        channel = channel();
    }

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean hasIndex = decoder.getHasIndex();
        Assert.assertTrue(hasIndex, "Expected getHasIndex to return true");
    }

}