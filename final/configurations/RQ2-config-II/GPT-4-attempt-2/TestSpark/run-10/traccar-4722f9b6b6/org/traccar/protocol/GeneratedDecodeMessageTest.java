package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.ArgumentCaptor;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeMessageTest {

    @Test
    public void decodeMessageTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

        // Initialize message buffer
        ByteBuf msg = Unpooled.buffer();
        msg.writeBytes(new byte[]{'t', 'e', 's', 't'});

        // Use captor to verify message sending
        ArgumentCaptor<Object> captor = ArgumentCaptor.forClass(Object.class);

        Object position = decoder.decode(channel, remoteAddress, msg);

        verify(channel).writeAndFlush(captor.capture());
        assertEquals("test", captor.getValue());
    }

}