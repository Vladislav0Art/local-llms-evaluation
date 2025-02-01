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

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        GalileoProtocolDecoder decoder = spy(new GalileoProtocolDecoder(null));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.buffer().writeByte(0x01);
        Position returnPosition = new Position();
        doReturn(returnPosition).when(decoder).decodePositions(any(), any(), any());
        Position decodePosition = (Position) decoder.decode(channel, remoteAddress, buf);
        assertSame(returnPosition, decodePosition);
    }

}