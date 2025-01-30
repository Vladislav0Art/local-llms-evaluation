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
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeInitializationMessageTest() throws Exception {
        String message = "[3G*1234567890*0009*INIT]";
        ByteBuf byteBuf = Unpooled.copiedBuffer(message, StandardCharsets.US_ASCII);

        when(deviceSession.getDeviceId()).thenReturn(1L);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.setDeviceSession(deviceSession);
        decoder.decode(channel, remoteAddress, byteBuf);

        verify(channel, times(1)).writeAndFlush(any(NetworkMessage.class));
    }

    @Test
    public void decodeLKMessageTest() throws Exception {
        String message = "[3G*1234567890*000F*LK,100,90]";
        ByteBuf byteBuf = Unpooled.copiedBuffer(message, StandardCharsets.US_ASCII);

        when(deviceSession.getDeviceId()).thenReturn(1L);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.setDeviceSession(deviceSession);
        Object result = decoder.decode(channel, remoteAddress, byteBuf);

        verify(channel, times(1)).writeAndFlush(any(NetworkMessage.class));
    }

    @Test
    public void decodeUDMessageTest() throws Exception {
        String message = "[3G*1234567890*0009*UD]";
        ByteBuf byteBuf = Unpooled.copiedBuffer(message, StandardCharsets.US_ASCII);

        when(deviceSession.getDeviceId()).thenReturn(1L);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.setDeviceSession(deviceSession);
        decoder.decode(channel, remoteAddress, byteBuf);

        verify(channel, times(1)).writeAndFlush(any(NetworkMessage.class));
    }

    @Test
    public void decodeUnreadableMessageTest() throws Exception {
        String message = "[3G*1234567890*0009*ZZZ]";
        ByteBuf byteBuf = Unpooled.copiedBuffer(message, StandardCharsets.US_ASCII);

        when(deviceSession.getDeviceId()).thenReturn(1L);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.setDeviceSession(deviceSession);
        decoder.decode(channel, remoteAddress, byteBuf);

        verify(channel, times(0)).writeAndFlush(any(NetworkMessage.class));
    }

}