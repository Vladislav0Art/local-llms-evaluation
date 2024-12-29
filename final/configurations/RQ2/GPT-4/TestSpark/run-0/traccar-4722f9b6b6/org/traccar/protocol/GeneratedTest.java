package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void decodeTest_NullMessage() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

        assertNull(decoder.decode(channel, remoteAddress, null));
    }

    @Test
    public void decodeTest_ValidMessage() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        byte[] msgBytes = "some string message".getBytes(StandardCharsets.UTF_8);

        assertNotNull(decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer(msgBytes)));
    }

}