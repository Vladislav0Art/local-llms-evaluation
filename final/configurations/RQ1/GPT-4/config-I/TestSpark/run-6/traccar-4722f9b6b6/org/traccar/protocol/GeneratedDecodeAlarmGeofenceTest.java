package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeAlarmGeofenceTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decodeAlarmGeofenceTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String alarmExit = decoder.decodeAlarm(1);
        String alarmEnter = decoder.decodeAlarm(19);
        assertEquals(Position.ALARM_GEOFENCE_EXIT, alarmExit);
        assertEquals(Position.ALARM_GEOFENCE_ENTER, alarmEnter);
    }

}