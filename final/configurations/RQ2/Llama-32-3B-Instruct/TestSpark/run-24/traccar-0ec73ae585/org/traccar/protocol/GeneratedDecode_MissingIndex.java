package org.traccar.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.Date;

import org.junit.Test;

public class GeneratedDecode_MissingIndex {

    @Test
    public void decode_MissingIndex() throws Exception {
        // Given
        byte[] data = "Data for Watch Protocol".getBytes();
        ByteBuf buffer = Unpooled.copiedBuffer(data);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        // When
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Object result = decoder.decode(channel, remoteAddress, msg);

        // Then
        assertEquals(false, (boolean) result);
    }

}