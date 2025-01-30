package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.ProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;
import io.netty.buffer.ByteBuf;

import java.net.SocketAddress;

import io.netty.channel.Channel;

public class GeneratedDecodeTest {

    private ByteBuf buf = Mockito.mock(ByteBuf.class);
    private SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
    private DeviceSession deviceSession;

    private WatchProtocolDecoder getDecoder() throws NoSuchFieldException, IllegalAccessException {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(ProtocolDecoder.class));
        return decoder;
    }

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder decoder = getDecoder();
        Channel channel = Mockito.mock(Channel.class);
        deviceSession = Mockito.mock(DeviceSession.class);
        Mockito.when(deviceSession.getDeviceId()).thenReturn(1L);
        Mockito.when(buf.indexOf(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyByte())).thenReturn(10);
        Mockito.when(buf.readSlice(Mockito.anyInt())).thenReturn(Unpooled.buffer());
        Assert.assertNull(decoder.decode(channel, remoteAddress, buf));
    }

}