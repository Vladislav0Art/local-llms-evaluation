package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.HashMap;

public class GeneratedDecode_GalileoPosition {

    @Test
    public void decode_GalileoPosition() {
        // given
        ByteBuf bytes = Unpooled.copiedBuffer("Galileo Position 1234567890.12345".getBytes(StandardCharsets.UTF_8));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        // when
        Object result = new GalileoProtocolDecoder(Protocol.GALILEO).decode(channel, remoteAddress, null);

        // then
        assertEquals("Galileo Position", BitBuffer.toString(result));
    }

}