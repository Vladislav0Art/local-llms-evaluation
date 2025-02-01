package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.Model;
import org.traccar.Protocol;
import org.traccar.dao.ServerManager;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.mockito.Mockito;
import org.traccar.session.Session;
import org.traccar.session.SessionManager;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedTest {

    @Test
    public void decodePositionValidTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        SessionManager sessionManager = Mockito.mock(SessionManager.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);
        decoder.setSessionManager(sessionManager);
        Session session = Mockito.mock(Session.class);
        Session session = new Session();
        Mockito.when(sessionManager.getOrCreateSession(Mockito.any(), Mockito.any())).thenReturn(session);

        ByteBuf buf = Unpooled.copiedBuffer("UD25,A,4357.8340,N,02046.3690,E,0.00,75.00,2.0,6,30.0,1,0,0002,1,,,,000000000000000000000001,",
                StandardCharsets.US_ASCII);

        Position position = decoder.decode(null, address, buf);

        assertNotNull(position);
        assertEquals("name", position.getProtocol());
        assertEquals(Position.ALARM_GEOFENCE_EXIT, position.getAlarm());
    }

    @Test
    public void decodePositionInvalidTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        SessionManager sessionManager = Mockito.mock(SessionManager.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);
        decoder.setSessionManager(sessionManager);
        Mockito.when(sessionManager.getOrCreateSession(Mockito.any(), Mockito.any())).thenReturn(new Session());

        ByteBuf buf = Unpooled.copiedBuffer("UD25,B,4357.8340,N,02046.3690,E,0.00,75.00,2.0,",
                StandardCharsets.US_ASCII);

        Position position = decoder.decode(null, address, buf);

        assertNull(position);
    }

    @Test
    public void decodeAlarmLowBatteryTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        String alarm = decoder.decodeAlarm(1);
        assertEquals(Position.ALARM_LOW_BATTERY, alarm);
    }

    @Test
    public void decodeAlarmGeofenceExitTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        String alarm = decoder.decodeAlarm(2);
        assertEquals(Position.ALARM_GEOFENCE_EXIT, alarm);
    }

    @Test
    public void decodeAlarmGeofenceEnterTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        String alarm = decoder.decodeAlarm(4);
        assertEquals(Position.ALARM_GEOFENCE_ENTER, alarm);
    }

    @Test
    public void decodeAlarmPowerCutTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        String alarm = decoder.decodeAlarm(16384);
        assertEquals(Position.ALARM_POWER_CUT, alarm);
    }

    @Test
    public void decodeAlarmSosTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        String alarm = decoder.decodeAlarm(65536);
        assertEquals(Position.ALARM_SOS, alarm);
    }

    @Test
    public void decodeAlarmRemovingTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        String alarm = decoder.decodeAlarm(1048576);
        assertEquals(Position.ALARM_REMOVING, alarm);
    }

    @Test
    public void decodeAlarmNullTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        String alarm = decoder.decodeAlarm(0);
        assertNull(alarm);
    }

}