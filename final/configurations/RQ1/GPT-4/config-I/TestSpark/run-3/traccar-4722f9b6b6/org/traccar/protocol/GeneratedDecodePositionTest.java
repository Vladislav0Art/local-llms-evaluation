package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import io.netty.channel.Channel;
import org.mockito.Mockito;
import io.netty.buffer.ByteBuf;

import java.net.SocketAddress;

import static org.junit.Assert.*;

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("WatchProtocolDecoderTest"));
        DeviceSession deviceSession = Mockito.mock(DeviceSession.class);
        Mockito.when(deviceSession.getDeviceId()).thenReturn(1L);
        assertNull(decoder.decodePosition(deviceSession, "130819,210918,V,25.761711,N,80.191331,W,1,0,0,-2.9,10,22,98,0,0,0FEB85B8,1,26,86413,Miami,720,80,33101,72,22,00000000"));
    }

}