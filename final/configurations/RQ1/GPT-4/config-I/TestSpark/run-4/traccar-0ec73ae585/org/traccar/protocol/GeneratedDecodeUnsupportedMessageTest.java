package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeUnsupportedMessageTest {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeUnsupportedMessageTest() throws Exception {
        String message = "[3G*1234567890*0009*ZZZ]";
        ByteBuf byteBuf = Unpooled.copiedBuffer(message, StandardCharsets.US_ASCII);

        when(this.protocol.createDeviceSession(any(), any(), any(), any())).thenReturn(this.deviceSession);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decode(channel, remoteAddress, byteBuf));
    }

}