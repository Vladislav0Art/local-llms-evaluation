package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.SessionManager;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeAlarmTest {

    private static final String CALLER_ID = "TEST_ID";
    private static final String TEST_ADDRESS = "testAddress123";

    @Test
    public void decodeAlarmTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        SessionManager sessionManager = mock(SessionManager.class);
        when(protocol.retrieveSessionManager()).thenReturn(sessionManager);
        when(sessionManager.getDeviceSession(any(), any(), any())).thenReturn(new NetworkSession(CALLER_ID));
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        int alarmGpsOff = 0b0000000000010000;
        assertEquals(Position.ALARM_GPS_ANTENNA_CUT, decoder.decodeAlarm(alarmGpsOff));

        int alarmPowerCut = 0b0100000000000000;
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(alarmPowerCut));

        int alarmBatteryLow = 0b0100010000000001;
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(alarmBatteryLow));

        int alarmGeofenceExit = 0b0100010001000000;
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(alarmGeofenceExit));

        int alarmGeofenceEnter = 0b0100100001000000;
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(alarmGeofenceEnter));
    }

}