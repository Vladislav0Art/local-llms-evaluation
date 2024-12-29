package org.traccar.protocol;

public class GeneratedTestDecodeMessageObject {

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
    public void testDecodeMessageObject() throws Exception {
        String messageStr = "message:Hello, World!";
        Object msg = decodeChannel(null, null, messageStr);
        assertNotNull(msg);
        assertEquals(MESSAGE, (String) msg);
    }
}

}