package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecodeDecodeWithMultipleMessages {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    @Test
    public void testDecodeDecodeWithMultipleMessages() throws Exception {
        when(channel.remoteAddress()).thenReturn(remoteAddress);
        when(channel.channelId()).thenReturn("channel");
        when(msg).thenReturn(null);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo"));
        Object result1 = decoder.decode(channel, remoteAddress, msg);
        Object result2 = decoder.decode(channel, remoteAddress, null);
        assertNotNull(result1);
        assertNotNull(result2);
    }

}