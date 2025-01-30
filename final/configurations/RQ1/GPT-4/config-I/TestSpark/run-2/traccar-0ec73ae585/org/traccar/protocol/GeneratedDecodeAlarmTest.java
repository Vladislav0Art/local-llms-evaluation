package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.CellTower;
import org.traccar.model.WifiAccessPoint;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.traccar.protocol.WatchProtocolDecoder;
import org.mockito.Mockito;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeAlarmTest {

    private Protocol createProtocolMock() {
        Protocol protocol = Mockito.mock(Protocol.class);
        when(protocol.getString(anyString(), anyString())).thenReturn("test");
        return protocol;
    }

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(createProtocolMock());
        assertEquals(null, decoder.decodeAlarm(0));
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(1));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(2));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(4));
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(16384));
        assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(65536));
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(131072));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(262144));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(524288));
        assertEquals(Position.ALARM_REMOVING, decoder.decodeAlarm(1048576));
        assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(2097152));
        assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(4194304));
    }

}