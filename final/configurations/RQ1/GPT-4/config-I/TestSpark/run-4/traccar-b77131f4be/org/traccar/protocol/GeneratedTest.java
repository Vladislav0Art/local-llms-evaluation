package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import org.traccar.protocol.GalileoProtocolDecoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        buf.writeBytes(new byte[2]);
        buf.writeBytes(new byte[3]);
        buf.writeIntLE(0);
        buf.writeBytes("123456789011111".getBytes(StandardCharsets.US_ASCII));
        buf.writeByte(0);
        buf.writeBytes(new byte[4]);
        buf.writeIntLE(0);
        buf.writeBytes(new byte[23]);
        buf.writeBytes(new byte[3]);
        buf.writeBytes(new byte[10]);

        Object result = decoder.decode(channel, remoteAddress, buf);
        assertNull(result);
    }

    @Test
    public void decodeTestWithDifferentHeader() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x02);
        buf.writeBytes(new byte[2]);
        buf.writeBytes(new byte[3]);
        buf.writeIntLE(0);
        buf.writeBytes("123456789011111".getBytes(StandardCharsets.US_ASCII));
        buf.writeByte(0);
        buf.writeBytes(new byte[4]);
        buf.writeIntLE(0);
        buf.writeBytes(new byte[23]);
        buf.writeBytes(new byte[3]);
        buf.writeBytes(new byte[10]);

        Object result = decoder.decode(channel, remoteAddress, buf);
        assertNull(result);
    }

}