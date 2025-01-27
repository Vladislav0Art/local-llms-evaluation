package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.net.SocketAddress;

public class GeneratedDecodeDecodeDecodeChannelNull {

    @Test
    public void decodeDecodeDecodeChannelNull() throws Exception {
        Channel channel = null;
        SocketAddress remoteAddress = Unpooled.buffer(10).slice();
        Object msg = Unpooled.buffer(20).slice();

        assertThrows(NullPointerException.class, () -> GalileoProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}