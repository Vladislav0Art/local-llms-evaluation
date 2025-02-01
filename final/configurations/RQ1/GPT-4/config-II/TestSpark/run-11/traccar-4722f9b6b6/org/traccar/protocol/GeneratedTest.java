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

public class GeneratedTest {

    @Test
    public void decodePositionInvalidPatternTest() {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        DeviceSession deviceSession = new DeviceSession("123", 1L);
        assertNull(decoder.decodePosition(deviceSession, ""));
    }

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

    @Test
    public void decodePositionNoMotionTest() {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        DeviceSession deviceSession = new DeviceSession("123", 1L);
        Position position = decoder.decodePosition(deviceSession, "300820,100000,A,40.0,N,30.0,E,1.0,2.0,10.0,5,70,50,0,1000,8000");
        assertFalse(position.getBoolean(Position.KEY_MOTION));
    }

    @Test
    public void decodeAlarmTest() {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0b0000000000000001));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(0b0000000000000010));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(0b0000000000000100));
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(0b0100000000000000));
        assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(0b1000000000000000));
        assertNull(decoder.decodeAlarm(0b0000000000000000));
    }

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        Mockito.when(channel.remoteAddress()).thenReturn(remoteAddress);
        Mockito.when(channel.writeAndFlush(Mockito.any())).thenReturn(null);
        ByteBuf buf = Unpooled.copiedBuffer("[3g*12345678*0002*LK]", StandardCharsets.US_ASCII);

        Object decoded = decoder.decode(channel, remoteAddress, buf);

        assertEquals("test", ((Position) decoded).getProtocol());
    }

}