package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.session.SessionManager;

import java.net.InetSocketAddress;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        SessionManager sessionManager = Mockito.mock(SessionManager.class);
        when(protocol.getSessionManager()).thenReturn(sessionManager);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 5000);
        String msg = "[CS*1234567890*0002*LK]";
        assertNotNull(decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer(msg.getBytes())));
    }

}