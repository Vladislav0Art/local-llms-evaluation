package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import io.netty.channel.Channel;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(2));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(19));
        assertEquals(Position.ALARM_REMOVING, decoder.decodeAlarm(20));
        assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(22));
    }

}