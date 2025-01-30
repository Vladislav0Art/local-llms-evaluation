package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedDecodeALKTest {

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
    public void decodeALKTest() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer("[TC012345678910*AL,2]", StandardCharsets.US_ASCII);
        Position position = (Position) decoder.decode(null, null, buf);
        assertEquals(Position.ALARM_GEOFENCE_EXIT, position.getAttributes().get(Position.KEY_ALARM));
    }

}