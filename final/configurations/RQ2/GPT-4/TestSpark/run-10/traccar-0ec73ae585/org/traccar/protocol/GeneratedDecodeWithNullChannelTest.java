package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;

import java.net.SocketAddress;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithNullChannelTest {

    @Test
    public void decodeWithNullChannelTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        ByteBuf byteBuf = Unpooled.wrappedBuffer("message".getBytes());
        Object decodedMessage = decoder.decode(null, remoteAddress, byteBuf);

        assertNotNull(decodedMessage);
    }

}