package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() {
        DeviceSession deviceSession = mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(1L);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol(""));
        assertNotNull(decoder.decodePosition(deviceSession, "121212121212A-122.301499N122.301499S100.00,0.00,-0.1,0,0,0,0,0,0,00000000,0"));
        assertNull(decoder.decodePosition(deviceSession, "1234567890"));
    }

}