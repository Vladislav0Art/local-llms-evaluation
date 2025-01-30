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
public class GeneratedDecodeUnsupportedHeaderTest {

    @Mock
    private Protocol protocol;

    @Test
    public void decodeUnsupportedHeaderTest() throws Exception {
        SocketAddress remoteAddress = mock(SocketAddress.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x03); // unsupported header

        assertNull(decoder.decode(channel, remoteAddress, buf));
    }

}