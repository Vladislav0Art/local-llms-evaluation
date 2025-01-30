package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedSendResponseWithIndexTest {

    @Test
    public void SendResponseWithIndexTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(Mockito.mock(SocketAddress.class));

        decoder.sendResponse(channel, "1001", "162", "TEST_CONTENT");
        assertNotNull(decoder);
    }

}