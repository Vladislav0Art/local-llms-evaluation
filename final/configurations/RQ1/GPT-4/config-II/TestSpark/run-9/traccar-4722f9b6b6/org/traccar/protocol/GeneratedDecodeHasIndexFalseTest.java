package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeHasIndexFalseTest {

    Protocol protocol = Mockito.mock(Protocol.class);

    DeviceSession deviceSession = Mockito.mock(DeviceSession.class);
    SocketAddress address = Mockito.mock(SocketAddress.class);

    private static final ByteBuf BYTE_BUF = Unpooled.copiedBuffer("msg", StandardCharsets.UTF_8);

    @Test
    public void decodeHasIndexFalseTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.getHasIndex();
        assertFalse(decoder.getHasIndex());
    }

}