package org.traccar.protocol;

public class GeneratedTestDecodeRemoteAddress SocketAddressSocketAddress {

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
    public void testDecodeRemoteAddress

    SocketAddressSocketAddress() throws Exception {
        String remoteAddressStr = "remoteAddress:10.0.2.3";
        SocketAddress address = TraccarProtocolUtil.parseSocketAddress(remoteAddressStr);
        Object msg = decodeChannel(null, null, remoteAddressStr);
        assertNotNull(msg);
        assertEquals(REMOTE_ADDRESS, (String) msg);
    }

}