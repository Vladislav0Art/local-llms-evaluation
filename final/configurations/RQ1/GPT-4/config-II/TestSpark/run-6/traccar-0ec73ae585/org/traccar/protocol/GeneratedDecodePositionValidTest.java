package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodePositionValidTest {

    @Test
    public void decodePositionValidTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        DeviceSession deviceSession = mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(12345L);
        assertNotNull(decoder.decodePosition(deviceSession, "170422,083402,A,2234.5801,N,11402.9358,E,0.00,154.71,0.30,07,1859464960,24,16598,0,42d48500,LBS:4,460,0,9526,26436,0,9526,26438,108,MCC:9460,0,9526,26436,-94,GSM:1,9460,0,9526,-94"));
    }

}