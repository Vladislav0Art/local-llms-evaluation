package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.net.SocketAddress;

public class GeneratedDecodeDecodeDecodeRemoteAddrNull {

    @Test
    public void decodeDecodeDecodeRemoteAddrNull() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = null;
        Object msg = Unpooled.buffer(20).slice();

        assertThrows(NullPointerException.class, () -> GalileoProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}