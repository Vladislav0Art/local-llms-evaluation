package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;

public class GeneratedDecode_Warning {

    @Test
    public void decode_Warning() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        ByteBuf buf = Unpooled.buffer();
        bitUtil.addInt(buf, 1);
        bitUtil.addInt(buf, 2);
        assertTrue(decoder.decode(channel, remoteAddress, msg) instanceof Integer);
    }

}