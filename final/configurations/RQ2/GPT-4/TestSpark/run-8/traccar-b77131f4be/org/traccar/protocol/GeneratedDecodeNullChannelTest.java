package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeNullChannelTest {

    @Test
    public void decodeNullChannelTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertNull(decoder.decode(null, null, Unpooled.buffer()));
    }

}