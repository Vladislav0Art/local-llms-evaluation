package org.traccar.protocol;

public class GeneratedTest {

    public boolean decode(Channel channel, Message message) {
        // Logic for decoding message
        return true;
    }

    public static boolean decode(Message message) {
        Channel channel = new Channel();
        return (Boolean) Gt06ProtocolDecoder.class.getMethod("decode", Channel.class, Message.class).invoke(null, channel, message);
    }
}

public class Gt06ProtocolDecoderTest {

}