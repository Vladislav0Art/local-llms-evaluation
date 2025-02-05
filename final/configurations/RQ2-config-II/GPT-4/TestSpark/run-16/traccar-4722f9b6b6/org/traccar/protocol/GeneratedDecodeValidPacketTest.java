package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.Session;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedDecodeValidPacketTest {

    @Test
    public void decodeValidPacketTest() throws Exception {
        Protocol protocol = new Protocol("watch") {
        };
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        ByteBuf buf = Unpooled.buffer();

        buf.writeBytes(new byte[]{0x5A, 0x00, 0x14, 0x01, 0x23, 0x00, (byte) 0xFF});

        assertNull(decoder.decode(channel, remoteAddress, buf));
    }

}