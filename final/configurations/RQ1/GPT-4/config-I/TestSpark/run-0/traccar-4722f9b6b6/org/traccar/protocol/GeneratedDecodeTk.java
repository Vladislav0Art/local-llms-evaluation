package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.SessionManager;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedDecodeTk {

    private static WatchProtocolDecoder decoder;

    @BeforeClass
    public static void setUp() {
        Protocol protocol = Mockito.mock(Protocol.class);
        decoder = new WatchProtocolDecoder(protocol);
    }

    @AfterClass
    public static void tearDown() {
        decoder = null;
    }

    @Test
    public void decodeTk() {
        ByteBuf buf = Unpooled.copiedBuffer("[3G*7800000000*000F*TK]", StandardCharsets.US_ASCII);
        SocketAddress remoteAddress = new InetSocketAddress(InetAddress.getByName("localhost"), 55000);

        SessionManager sessionManager = Mockito.mock(SessionManager.class);
        DeviceSession deviceSession = Mockito.mock(DeviceSession.class);

        when(sessionManager.getDeviceSession(any(), any(String.class))
                .thenReturn(deviceSession);
		)

        when(deviceSession.getDeviceId()).thenReturn(7800000000L);

        Position position = (Position) decoder.decode(sessionManager, remoteAddress, buf);
        assertNotNull(position);
        assertEquals(7800000000L, position.getDeviceId().longValue());
    }

}