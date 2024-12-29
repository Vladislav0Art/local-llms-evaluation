package org.traccar.protocol;

public class GeneratedTestParseSocketAddress {

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
    public void testParseSocketAddress() {
        String addressStr = "remoteAddress:10.0.2.3";
        SocketAddress address = TraccarProtocolUtil.parseSocketAddress(addressStr);
        assertEquals(REMOTE_ADDRESS, address.host().getHostAddresses()[0].getAddress().getHostName());
    }
}

}