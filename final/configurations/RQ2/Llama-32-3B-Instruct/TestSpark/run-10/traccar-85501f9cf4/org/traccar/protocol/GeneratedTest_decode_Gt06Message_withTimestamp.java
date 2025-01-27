package org.traccar.protocol;

public class GeneratedTest_decode_Gt06Message_withTimestamp {

    private int timestamp;
    private String message;
    private int data;

    public NetworkMessage(int timestamp, String message, int data) {
        this.timestamp = timestamp;
        this.message = message;
        this.data = data;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public int getData() {
        return data;
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
        // implement decoding logic here
        NetworkMessage networkMessage = new NetworkMessage(0, "message", 100);
        return networkMessage;
    }

    public static void main(String[] args) {
        org.junit.Test
        public void test_decode_Gt06Message () {
            NetworkMessage expected = new NetworkMessage(0, "message", 100);
            Channel channel = null;
            SocketAddress remoteAddress = null;
            Object msg = null;
            assertEquals(expected, Gt06ProtocolDecoder.decode(channel, remoteAddress, msg));
        }

        @Test
        public void test_decode_Gt06Message_withTimestamp () {
            NetworkMessage expected = new NetworkMessage(1643723400, "message", 100);
            Channel channel = null;
            SocketAddress remoteAddress = null;
            Object msg = null;
            assertEquals(expected, Gt06ProtocolDecoder.decode(channel, remoteAddress, msg));
        }

    }