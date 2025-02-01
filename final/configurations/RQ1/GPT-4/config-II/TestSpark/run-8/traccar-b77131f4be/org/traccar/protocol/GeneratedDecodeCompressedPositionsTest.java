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

public class GeneratedDecodeCompressedPositionsTest {

    @Test
    public void decodeCompressedPositionsTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf buf = mock(ByteBuf.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Channel channel = mock(Channel.class);
        when(buf.readUnsignedShortLE()).thenReturn(2);
        when(buf.readableBytes()).thenReturn(2);

        DeviceSession deviceSession = new DeviceSession(null);

        when(decoder.getDeviceSession(channel, remoteAddress)).thenReturn(deviceSession);

        List<Position> positions = decoder.decodeCompressedPositions(channel, remoteAddress, buf);

        for (Position position : positions) {
            assertEquals(deviceSession.getDeviceId(), position.getDeviceId());
        }
    }

}