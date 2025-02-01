package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodePositionsTest {

    @Test
    public void decodePositionsTest() throws Exception {
        GalileoProtocolDecoder decoder = spy(new GalileoProtocolDecoder(null));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.buffer().writeShortLE(2).writeInt(1);
        DeviceSession session = Mockito.mock(DeviceSession.class);
        doReturn(session).when(decoder).getDeviceSession(any(), any(), anyString());
        Object object = decoder.decodePositions(channel, remoteAddress, buf);
        assertTrue(object instanceof List);
    }

}