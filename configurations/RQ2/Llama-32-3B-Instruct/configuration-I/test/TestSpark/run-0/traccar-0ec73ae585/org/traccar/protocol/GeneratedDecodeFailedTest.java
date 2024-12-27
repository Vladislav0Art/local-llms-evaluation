package org.traccar.protocol;

public class GeneratedDecodeFailedTest {

    @Test
    public void decodeFailedTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.OTHER);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new SocketAddress();
        byte[] buffer = new byte[10];
        buffer[0] = 1;
        buffer[1] = 2;
        Object msg = new Message(buffer);

        decoder.decode(channel, remoteAddress, msg);
    }
}

public class Protocol {
    public static final int WATCH = 1;
    public static final int OTHER = 2;
}

public class Channel {
    public void add(int value) {
    }
}

public class SocketAddress {
}

public class Message {
    private byte[] buffer;

    public Message(byte[] buffer) {
        this.buffer = buffer;
    }

}