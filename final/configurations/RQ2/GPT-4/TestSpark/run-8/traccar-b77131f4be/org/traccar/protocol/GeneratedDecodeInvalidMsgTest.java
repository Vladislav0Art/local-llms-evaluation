package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeInvalidMsgTest {

    @Test
    public void decodeInvalidMsgTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);

        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(0xFF);  // invalid data

        assertNull(decoder.decode(channel, null, buffer));
    }

}