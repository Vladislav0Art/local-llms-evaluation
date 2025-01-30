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
public class GeneratedDecodePhotoTest {

    @Mock
    private Protocol protocol;

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