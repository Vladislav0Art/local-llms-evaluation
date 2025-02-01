package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithLkTypeTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decodeWithLkTypeTest() throws Exception {
        String id = "id1";
        String messageString = "[" + id + "*LK]";
        ByteBuf message = Unpooled.copiedBuffer(messageString, StandardCharsets.US_ASCII);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        when(channel.remoteAddress()).thenReturn(remoteAddress);
        when(decoder.getDeviceSession(channel, remoteAddress, id)).thenReturn(deviceSession);

        decoder.decode(channel, remoteAddress, message);

        verify(channel).writeAndFlush(any(NetworkMessage.class));
    }

}