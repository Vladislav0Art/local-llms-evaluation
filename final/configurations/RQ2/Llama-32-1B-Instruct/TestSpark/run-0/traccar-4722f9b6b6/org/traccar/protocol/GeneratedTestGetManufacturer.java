package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

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
    public void testGetManufacturer() {
        Device device = new Device();
        String manufacturer = device.getManufacturer();
        assertNotNull(manufacturer);
        assertEquals("Traccar", manufacturer);
    }

}