package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.net.SocketAddress;
import java.util.Date;

import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Test
    public void decodePositionTest() throws Exception {
        SocketAddress remoteAddress = mock(SocketAddress.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01); // header
        buf.writeShortLE(0x30); // length
        buf.writeByte(0x03); // tag
        buf.writeBytes("123456789012345".getBytes()); // device id
        buf.writeByte(0x30); // location tag
        buf.writeByte(0x00); // validity
        buf.writeIntLE((int) (51.476852 * 1000000)); // latitude
        buf.writeIntLE((int) (-0.000450 * 1000000)); // longitude
        buf.writeByte(0x20); // time tag
        buf.writeIntLE((int) (new Date().getTime() / 1000));

        decoder.decode(channel, remoteAddress, buf);
    }

    @Test
    public void decodeUnsupportedHeaderTest() throws Exception {
        SocketAddress remoteAddress = mock(SocketAddress.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x03); // unsupported header

        assertNull(decoder.decode(channel, remoteAddress, buf));
    }

    @Test
    public void decodePhotoTest() throws Exception {
        SocketAddress remoteAddress = mock(SocketAddress.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);

        byte[] mockImageData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x07); // header
        buf.writeShortLE(mockImageData.length + 1); // length
        buf.writeByte(0x01); // part number
        buf.writeBytes(mockImageData);
        buf.writeShortLE(0); // checksum

        // Mock writeAndFlush so it doesn't throw NullPointerException due to lack of actual channel implementation.
        doAnswer(new Answer<Void>() {
            public Void answer(InvocationOnMock invocation) {
                return null;
            }
        }).when(channel).writeAndFlush(any());

        decoder.decode(channel, remoteAddress, buf);
    }

}