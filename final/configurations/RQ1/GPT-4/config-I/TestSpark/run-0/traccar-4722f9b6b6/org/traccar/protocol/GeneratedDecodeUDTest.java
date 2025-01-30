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

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.ArgumentMatchers.any;
import static org.junit.Assert.*;

public class GeneratedDecodeUDTest {

    private static WatchProtocolDecoder decoder;
    private static SessionManager sessionManager;
    private static InetSocketAddress remoteAddress;

    @BeforeClass
    public static void setUp() {
        Protocol protocol = Mockito.mock(Protocol.class);
        decoder = new WatchProtocolDecoder(protocol);
        sessionManager = Mockito.mock(SessionManager.class);
        remoteAddress = new InetSocketAddress("localhost", 55000);
    }

    @AfterClass
    public static void tearDown() {
        decoder = null;
        sessionManager = null;
        remoteAddress = null;
    }

    @Test
    public void decodeUDTest() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer("[3G*7800000000*037C*UD,041119,A,4829.188,N,00903.845,E,0.01,48,14312.0,F,392,1,0,86,30,0_89DC]", StandardCharsets.US_ASCII);
        when(sessionManager.getDeviceSession(any(), any())).thenReturn(new DeviceSession(7800000000L));

        Position position = (Position) decoder.decode(sessionManager, remoteAddress, buf);

        assertEquals(7800000000L, position.getDeviceId().longValue());
    }

}