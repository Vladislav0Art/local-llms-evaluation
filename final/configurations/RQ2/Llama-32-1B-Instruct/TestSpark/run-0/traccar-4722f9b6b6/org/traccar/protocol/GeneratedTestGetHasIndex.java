package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

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
    public void testGetHasIndex() {
        Device device = new Device();
        boolean hasIndex = device.getHasIndex();
        assertTrue(hasIndex);
    }
}

}