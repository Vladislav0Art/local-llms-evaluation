package org.traccar.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDecodePositionsTest {

    @Test
    public void decodePositionsTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf buf = mock(ByteBuf.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Channel channel = mock(Channel.class);
        when(buf.getUnsignedByte()).thenReturn(0x01);
        when(buf.readUnsignedShortLE()).thenReturn(1);
        when(buf.readUnsignedByte()).thenReturn(0x03);
        when(buf.readSlice(any(Integer.class))).thenReturn(buf);

        when(buf.toString(StandardCharsets.US_ASCII)).thenReturn("test");
        when(decoder.getDeviceSession(channel, remoteAddress, "test")).thenReturn(new DeviceSession(null));

        List<Position> positions = decoder.decodePositions(channel, remoteAddress, buf);
        assertTrue(positions.size() > 0);
    }

}