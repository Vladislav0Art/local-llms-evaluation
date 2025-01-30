package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() {
        Protocol protocol = new Protocol("WatchProtocolTest");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        DeviceSession deviceSession = new DeviceSession(1);
        String data = "140319,183308,A, 25.519065,N, 82.801089,E, 0.0,160.0,0.0,14,255,24,2553,0,60574,0,510,10,23930,2735,-72";
        Position position = decoder.decodePosition(deviceSession, data);

        assertNotNull(position);
        assertEquals(25.519065, position.getLatitude(), 0.001);
        assertEquals(82.801089, position.getLongitude(), 0.001);
        assertEquals(160.0, position.getCourse(), 0.001);
        assertEquals(14, position.get(Position.KEY_SATELLITES));
        assertEquals(255, position.get(Position.KEY_RSSI));
        assertEquals(24, position.get(Position.KEY_BATTERY_LEVEL));
        assertEquals(2553, position.get(Position.KEY_STEPS));
    }

}