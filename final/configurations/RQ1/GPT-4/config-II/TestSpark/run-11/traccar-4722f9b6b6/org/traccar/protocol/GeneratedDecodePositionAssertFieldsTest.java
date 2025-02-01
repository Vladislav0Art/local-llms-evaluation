package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.*;

public class GeneratedDecodePositionAssertFieldsTest {

    @Test
    public void decodePositionAssertFieldsTest() {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        DeviceSession deviceSession = new DeviceSession("123", 1L);
        Position position = decoder.decodePosition(deviceSession, "300820,100000,A,40.0,N,30.0,E,1.0,2.0,10.0,5,70,50,0,1000,80EA,1,1");
        assertEquals(deviceSession.getDeviceId(), position.getDeviceId());
        assertEquals(new Date(120, 7, 30, 10, 0, 0), position.getTime());
        assertEquals(40.0, position.getLatitude(), 0.0);
        assertEquals(30.0, position.getLongitude(), 0.0);
        assertTrue(position.getBoolean(Position.KEY_MOTION));
    }

}