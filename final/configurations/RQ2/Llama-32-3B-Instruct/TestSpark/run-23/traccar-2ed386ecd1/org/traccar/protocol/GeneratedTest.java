package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testDecode() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder();
        Channel channel = decoder.decode(null, null, "Hello World");
        assertEquals(4, ((Integer) channel.getMsgSize()).intValue());
    }

    @Test
    public void testException() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder();
        Channel channel = decoder.decode(null, null, "Invalid Message");
        assertEquals("Invalid Message", ((String) channel.getException()).trim());
    }
}

class Gt06ProtocolDecoder {
    public Channel decode(Channel channel, SocketAddress remoteAddress, Object msg) {
        if (msg instanceof String) {
            return new Channel((Integer) ((String) msg).length(), null);
        } else {
            throw new RuntimeException("Invalid message type");
        }
    }

    public static class Channel {
        private int msgSize;
        private Exception exception;

        public Channel(int msgSize, Exception exception) {
            this.msgSize = msgSize;
            this.exception = exception;
        }

        public int getMsgSize() {
            return msgSize;
        }

        public String getException() {
            return exception != null ? exception.toString() : null;
        }
    }
}

}