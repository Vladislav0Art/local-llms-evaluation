package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeMessageWithSupportedProtocolTest {

    @Test
    public void decodeMessageWithSupportedProtocolTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        DeviceSession deviceSession = new DeviceSession("sessionId");
        ByteBuf buf = Unpooled.wrappedBuffer("SUPPORTEDPROTOCOL".getBytes());

        when(protocol.createDeviceSession("identifier")).thenReturn(deviceSession);
        assertEquals(deviceSession, decoder.decode(channel, remoteAddress, buf));
    }

}