package org.traccar.protocol;

public class GeneratedTestDecodeChannel ChannelChannel {

    public static String parseChannel(String channelStr) {
        return channelStr;
    }

    public static SocketAddress parseSocketAddress(String addressStr) {
        return PatternBuilder.parseSocketAddress(addressStr);
    }
}

public interface NettyChannel {
    int type();
}

public class ChannelTest {

    @Test
    public void testDecodeChannel

    ChannelChannel() throws Exception {
        String channelStr = "channel:10.0.2.3";
        NettyChannel channel = TraccarProtocolUtil.parseChannel(channelStr);
        Object msg = decodeChannel(channel, null, null);
        assertNotNull(msg);
        assertEquals(CHANNEL, (String) msg);
    }

}