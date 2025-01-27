package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Date;

public class GeneratedTest {

    @Test
    public void decodeGpsPositionOnlyTest() {
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), false, null);
        assertTrue(result);
    }

    @Test
    public void decodeGpsPositionWithDateTest() {
        Date date = DateBuilder.dateCalendar(2022, 1, 1, 12, 0, 0);
        Position position = new Position(date);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), false, null);
        assertTrue(result);
    }

    @Test
    public void decodeGpsPositionWithSpeedTest() {
        Position position = new Position();
        double speed = 100.0;
        position.setSpeed(speed);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), false, null);
        assertTrue(result);
    }

    @Test
    public void decodeGpsPositionWithSatellitesTest() {
        Position position = new Position();
        int satellites = 12;
        position.setSatellites(satellites);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), false, null);
        assertTrue(result);
    }

    @Test
    public void decodeGpsPositionWithAllFieldsTest() {
        Position position = new Position();
        Date date = DateBuilder.dateCalendar(2022, 1, 1, 12, 0, 0);
        double speed = 100.0;
        int satellites = 12;
        position.setDate(date);
        position.setSpeed(speed);
        position.setSatellites(satellites);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), false, null);
        assertTrue(result);
    }

    @Test
    public void decodePositionOnlyTest() {
        Object result = Gt06ProtocolDecoder.decode(null, null, null);
        assertNull(result);
    }

    @Test
    public void decodePositionWithMessageTest() {
        Object message = new Object();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = null;
        Object result = Gt06ProtocolDecoder.decode(channel, remoteAddress, message);
        assertNotNull(result);
    }

}