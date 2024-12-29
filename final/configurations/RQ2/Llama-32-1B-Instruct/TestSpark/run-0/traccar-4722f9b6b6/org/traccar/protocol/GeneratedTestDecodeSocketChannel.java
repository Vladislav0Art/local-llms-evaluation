package org.traccar.protocol;

public class GeneratedTestDecodeSocketChannel {

    private static final String CHANNEL = "channel";
    private static final String REMOTE_ADDRESS = "remoteAddress";
    private static final String MESSAGE = "message";

    public WatchProtocolDecoderTest() {
    }

    @Test
    public void testDecodeSocketChannel() throws Exception {
        Channel channel = parseChannel(CHANNEL);
        Object msg = decodeChannel(channel, REMOTE_ADDRESS, MESSAGE);
        assertNotNull(msg);
        assertEquals(CHANNEL, (String) msg);
    }

    private static NettyChannel parseChannel(String channelStr) {
        return ParseUtils.parseChannel(channelStr);
    }

}