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

public class GeneratedDecodeTypeUnsupportedTest {

    @Test
    public void decodeTypeUnsupportedTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeCharSequence("[3G*1234567890*0007*XYZ]", StandardCharsets.US_ASCII);
        Protocol protocol = mock(Protocol.class);
        Channel channel = mock(Channel.class);
        when(protocol.getDeviceSessionManager()).thenReturn(mock(DeviceSession.DeviceSessionManager.class));
        when(protocol.getDeviceSessionManager().getDeviceSession(any(), any(), any())).thenReturn(mock(DeviceSession.class));

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decode(channel, mock(SocketAddress.class), buf));
    }

}