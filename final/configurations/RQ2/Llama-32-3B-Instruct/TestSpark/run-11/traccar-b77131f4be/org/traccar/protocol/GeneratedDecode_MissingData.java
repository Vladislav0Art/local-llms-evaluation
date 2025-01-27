package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.HashMap;

public class GeneratedDecode_MissingData {

    @Test
    public void decode_MissingData() {
        // given
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        // when
        Object result = new GalileoProtocolDecoder(Protocol.GALILEO).decode(channel, remoteAddress, null);

        // then
        assertNull(result);
    }

}