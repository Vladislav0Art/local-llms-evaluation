package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodeWithInvalidMessageTest {

    @Test
    public void decodeWithInvalidMessageTest() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8080);
        String testString = "invalidString";
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("someProtocol"));
        try {
            decoder.decode(channel, remoteAddress, testString);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertEquals("Invalid message received", e.getMessage());
        }
    }

}