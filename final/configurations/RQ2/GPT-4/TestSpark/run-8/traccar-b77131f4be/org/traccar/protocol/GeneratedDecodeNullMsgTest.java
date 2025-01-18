package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeNullMsgTest {

    @Test
    public void decodeNullMsgTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        assertNull(decoder.decode(channel, null, null));
    }

}