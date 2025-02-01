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

public class GeneratedDecodePositionValidTest {

    @Test
    public void decodePositionValidTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        SessionManager sessionManager = Mockito.mock(SessionManager.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);
        decoder.setSessionManager(sessionManager);
        Session session = Mockito.mock(Session.class);
        Session session = new Session();
        Mockito.when(sessionManager.getOrCreateSession(Mockito.any(), Mockito.any())).thenReturn(session);

        ByteBuf buf = Unpooled.copiedBuffer("UD25,A,4357.8340,N,02046.3690,E,0.00,75.00,2.0,6,30.0,1,0,0002,1,,,,000000000000000000000001,",
                StandardCharsets.US_ASCII);

        Position position = decoder.decode(null, address, buf);

        assertNotNull(position);
        assertEquals("name", position.getProtocol());
        assertEquals(Position.ALARM_GEOFENCE_EXIT, position.getAlarm());
    }

}