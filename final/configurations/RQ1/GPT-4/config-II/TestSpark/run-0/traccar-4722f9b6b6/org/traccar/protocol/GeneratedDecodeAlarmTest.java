package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(1));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(2));
        assertNull(decoder.decodeAlarm(13));
    }

}