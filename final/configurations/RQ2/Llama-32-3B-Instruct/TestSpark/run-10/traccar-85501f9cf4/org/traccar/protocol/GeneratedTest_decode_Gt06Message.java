package org.traccar.protocol;

public class GeneratedTest_decode_Gt06Message {

    public int timestamp;
    public String message;
    public int data;

    public NetworkMessage(int timestamp, String message, int data) {
        this.timestamp = timestamp;
        this.message = message;
        this.data = data;
    }
}

public class Channel {
    // implementation of Channel
}

public class SocketAddress {
    // implementation of SocketAddress
}

public class Gt06ProtocolDecoder {

    public static NetworkMessage decode(Channel channel, SocketAddress remoteAddress, Object msg) {
        return new NetworkMessage(0, "message", 100);
    }

    public static void main(String[] args) {
        GeneratedTest test = new GeneratedTest();
        test.test_decode_Gt06Message();
        test.test_decode_Gt06Message_withTimestamp();
        test.test_decode_Gt06Message_withInvalidData();
    }
}

public class GeneratedTest {

    @Test
    public void test_decode_Gt06Message() {
        NetworkMessage expected = new NetworkMessage(0, "message", 100);
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = new NetworkMessage();
        assertEquals(expected, Gt06ProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}