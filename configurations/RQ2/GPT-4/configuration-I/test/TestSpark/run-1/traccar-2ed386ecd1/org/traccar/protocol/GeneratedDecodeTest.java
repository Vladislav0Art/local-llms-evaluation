package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.TimeZone;

import io.netty.channel.ChannelHandlerContext;

import static org.mockito.Mockito.verify;

import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.mockito.runners.MockitoJUnitRunner;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    private Position position = new Position();

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new Object();
        decoder.decode(channel, remoteAddress, msg);
    }

}