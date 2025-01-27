package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.net.SocketAddress;

public class GeneratedDecodeDecodeDecodeEmptyChannel {

    @Test
    public void decodeDecodeDecodeEmptyChannel() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Unpooled.buffer(10).slice();
        Object msg = Unpooled.buffer(20).slice();

        GalileoProtocolDecoder.decode(null, remoteAddress, null);
    }

}