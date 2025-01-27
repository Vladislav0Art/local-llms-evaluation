package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;
import java.util.Date;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeDecodeTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeDecodeTest() throws Exception {
        BitUtil.setBit(1);
        Pattern pattern = new PatternBuilder()
                .pattern("WatchData")
                .build();
        when(protocol.getName()).thenReturn(pattern.toString());
        when(channel.allocBuffer()).thenReturn(Unpooled.buffer());

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object decodedObject = decoder.decode(channel, remoteAddress, 0);

        assertNotNull(decodedObject);
    }

}