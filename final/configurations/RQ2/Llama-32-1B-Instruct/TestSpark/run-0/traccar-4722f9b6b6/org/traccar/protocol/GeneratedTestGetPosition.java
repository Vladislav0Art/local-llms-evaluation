package org.traccar.protocol;

public class GeneratedTestGetPosition {

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
    public void testGetPosition() {
        Position position = new Position();
        position.setDate(DATE);
        position.setLongitude(37.7749);
        position.setLatitude(-122.4194);
        assertEquals(position, decodeChannel(null, null, null));
    }
}

}