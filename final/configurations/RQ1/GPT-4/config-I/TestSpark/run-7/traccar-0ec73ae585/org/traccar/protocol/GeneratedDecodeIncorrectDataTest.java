package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.SessionManager;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeIncorrectDataTest {

    private static final String CALLER_ID = "TEST_ID";
    private static final String TEST_ADDRESS = "testAddress123";

    @Test
    public void decodeIncorrectDataTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        SessionManager sessionManager = mock(SessionManager.class);
        when(protocol.retrieveSessionManager()).thenReturn(sessionManager);
        when(sessionManager.getDeviceSession(any(), any(), any())).thenReturn(new NetworkSession(CALLER_ID));
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.decodePosition(null, "IncorrectData"));
    }

}