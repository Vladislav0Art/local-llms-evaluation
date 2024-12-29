package org.traccar.protocol;

public class GeneratedTestDecodeChannelChannel {

    private static final String CHANNEL = "channel";
    private static final String REMOTE_ADDRESS = "remoteAddress";
    private static final String MESSAGE = "message";

    public WatchProtocolDecoderTest() {
    }

    @Test
    public void testDecodeChannelChannel() throws Exception {
        String channelStr = "channel:10.0.2.3";
        Channel channel = parseChannel(channelStr);
        Object msg = decodeChannel(channel, REMOTE_ADDRESS, MESSAGE);
        assertNotNull(msg);
        assertEquals(CHANNEL, (String) msg);
    }

}