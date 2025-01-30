package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;
import org.traccar.Protocol;
import org.traccar.DeviceSession;
import org.traccar.model.Position;
import org.traccar.helper.DataConverter;

public class GeneratedDecodeAlarmGeofenceExitTest {

    private static final String ALARM_ENTER = "enter";
    private static final String ALARM_EXIT = "exit";
    private static final String ALARM_LOW_BATTERY = "lowBattery";

    @Test
    public void decodeAlarmGeofenceExitTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertEquals(decoder.decodeAlarm(2), Position.ALARM_GEOFENCE_EXIT);
    }

}