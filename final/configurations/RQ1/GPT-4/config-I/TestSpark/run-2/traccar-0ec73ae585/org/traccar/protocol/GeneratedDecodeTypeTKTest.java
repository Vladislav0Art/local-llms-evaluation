package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeTypeTKTest {

    @Test
    public void decodeTypeTKTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeCharSequence("[3G*1234567890*00C9*TK9831000000000000,mocking,00]", StandardCharsets.US_ASCII);
        Protocol protocol = mock(Protocol.class);
        Channel channel = mock(Channel.class);
        when(protocol.getDeviceSessionManager()).thenReturn(mock(DeviceSession.DeviceSessionManager.class));
        DeviceSession deviceSession = mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(1L);
        when(protocol.getDeviceSessionManager().getDeviceSession(any(), any(), any())).thenReturn(deviceSession);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Position decodedPosition = (Position) decoder.decode(channel, mock(SocketAddress.class), buf);
        assertNull(decodedPosition.getProtocol());
        assertEquals(deviceSession.getDeviceId(), decodedPosition.getDeviceId());
        assertNull(decodedPosition.getOther());
    }

}