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

public class GeneratedGetHasIndexTest {

    private ByteBuf buf = Mockito.mock(ByteBuf.class);
    private SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
    private DeviceSession deviceSession;

    private WatchProtocolDecoder getDecoder() throws NoSuchFieldException, IllegalAccessException {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(ProtocolDecoder.class));
        return decoder;
    }

    @Test
    public void getHasIndexTest() throws IllegalAccessException, NoSuchFieldException {
        WatchProtocolDecoder decoder = getDecoder();
        Assert.assertFalse(decoder.getHasIndex());
    }

}