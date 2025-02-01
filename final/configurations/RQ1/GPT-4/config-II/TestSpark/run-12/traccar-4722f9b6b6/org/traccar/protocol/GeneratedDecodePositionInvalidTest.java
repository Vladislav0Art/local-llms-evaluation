package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.Model;
import org.traccar.Protocol;
import org.traccar.dao.ServerManager;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.mockito.Mockito;
import org.traccar.session.Session;
import org.traccar.session.SessionManager;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedDecodePositionInvalidTest {

    @Test
    public void decodePositionInvalidTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        SessionManager sessionManager = Mockito.mock(SessionManager.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);
        decoder.setSessionManager(sessionManager);
        Mockito.when(sessionManager.getOrCreateSession(Mockito.any(), Mockito.any())).thenReturn(new Session());

        ByteBuf buf = Unpooled.copiedBuffer("UD25,B,4357.8340,N,02046.3690,E,0.00,75.00,2.0,",
                StandardCharsets.US_ASCII);

        Position position = decoder.decode(null, address, buf);

        assertNull(position);
    }

}