package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeValidDataTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeValidDataTest() throws Exception {
        String data = "some valid data";
        ByteBuf buffer = Unpooled.copiedBuffer(data.getBytes());

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Object decodedObject = decoder.decode(channel, remoteAddress, buffer);

        assertNotNull(decodedObject);
    }

}