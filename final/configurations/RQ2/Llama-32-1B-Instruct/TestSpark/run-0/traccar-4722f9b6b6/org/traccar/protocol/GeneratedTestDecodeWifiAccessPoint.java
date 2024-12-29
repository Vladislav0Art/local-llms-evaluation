package org.traccar.protocol;

public class GeneratedTestDecodeWifiAccessPoint {

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
    public void testDecodeWifiAccessPoint() throws Exception {
        String wifiAccessPointStr = "wifi access point:1.0.0.2";
        Network network = decodeChannel(null, null, wifiAccessPointStr);
        assertNotNull(network);
        assertEquals(1, network.size());
        Position position = decodePosition(network.get(0), null);
        assertNotNull(position);
    }

}