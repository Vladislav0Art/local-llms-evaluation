package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;

public class GeneratedDecode_GetDeviceId {

    @Test
    public void decode_GetDeviceId() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = Arrays.asList("1", "2"); // device id and cell id

        ByteBuf buf = Unpooled.buffer();
        bitUtil.addInt(buf, 3);
        assertTrue(decoder.decode(channel, remoteAddress, msg) instanceof Integer);
    }

}