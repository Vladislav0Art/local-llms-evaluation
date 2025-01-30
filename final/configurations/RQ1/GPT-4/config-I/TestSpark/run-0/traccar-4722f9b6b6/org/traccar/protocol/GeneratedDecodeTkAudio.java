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

public class GeneratedDecodeTkAudio {

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
    public void decodeTkAudio() {
        ByteBuf buf = Unpooled.copiedBuffer("[3G*7800000000*008A*TK,041119,A,4829.188,N,00903.845,E,0.00,0,14320.0,F,392,1,0,80,33,1]", StandardCharsets.US_ASCII);
        Position position = (Position) decoder.decode(sessionManager, remoteAddress, buf);
        assertNotNull(position);
        assertEquals(7800000000L, position.getDeviceId().longValue());
        assertNotNull(position.getAttributes().get(Position.KEY_AUDIO));
    }

}