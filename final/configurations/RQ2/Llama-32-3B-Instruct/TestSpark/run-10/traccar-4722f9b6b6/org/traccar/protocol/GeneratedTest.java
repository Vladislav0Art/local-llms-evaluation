package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testGenerateChannel() {
        Channel channel = new Channel();
        assertEquals("channel", generateChannel(channel));
    }

    @Test
    public void testGenerateAddress() {
        SocketAddress address = new SocketAddress();
        assertEquals("address", generateAddress(address));
    }
}

class Channel {

    public String getChannel() {
        return this.toString();
    }
}

class SocketAddress {

    private String value;

    public SocketAddress(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public String getAddress() {
        return this.toString();
    }
}

public class GeneratedTest {

    public static String generateChannel(Channel channel) {
        return channel.getChannel();
    }

    public static String generateAddress(SocketAddress address) {
        return address.getAddress();
    }

}