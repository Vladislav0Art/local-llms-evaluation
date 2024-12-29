package org.traccar.protocol;

public class GeneratedTestParseChannel {

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
    public void testParseChannel() {
        String channelStr = "channel:10.0.2.3";
        NettyChannel channel = TraccarProtocolUtil.parseChannel(channelStr);
        assertEquals(CHANNEL, channel.type());
    }

}