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

public class GeneratedDecodePositionValidDataTest {

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
    public void decodePositionValidDataTest() {
        DeviceSession deviceSession = Mockito.mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(12345L);
        Position position = decoder.decodePosition(deviceSession, "201119,092550,A,4608.2035,N,00608.2035,E,000.8,0.0,10.0,4,2,10,20,1");
        assertEquals(new Date(120, 10, 20, 9, 25, 50), position.getDeviceTime());
        assertEquals(12345L, position.getDeviceId().longValue());
    }

}