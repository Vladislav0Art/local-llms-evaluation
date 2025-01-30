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

public class GeneratedDecodeUnknownTypeTest {

    @Test
    public void decodeUnknownTypeTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeCharSequence("[3G*1234567890*0007*XYZ]", StandardCharsets.US_ASCII);

        Protocol protocol = mock(Protocol.class);
        Channel channel = mock(Channel.class);
        DeviceSession deviceSession = mock(DeviceSession.class);

        when(protocol.getDeviceSession(channel, null, "1234567890")).thenReturn(deviceSession);
        when(deviceSession.getDeviceId()).thenReturn(1L);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decode(channel, mock(SocketAddress.class), buf));
    }

}