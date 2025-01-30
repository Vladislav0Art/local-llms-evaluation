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

public class GeneratedTest {

    private static final String ALARM_ENTER = "enter";
    private static final String ALARM_EXIT = "exit";
    private static final String ALARM_LOW_BATTERY = "lowBattery";

    @Test
    public void decodeAlarmTest() {
        Protocol protocol = mock(Protocol.class);
        when(protocol.getName()).thenReturn("watch");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Assert.assertEquals(ALARM_LOW_BATTERY,
                decoder.decodeAlarm(1 << 0));
        Assert.assertEquals(ALARM_EXIT,
                decoder.decodeAlarm(1 << 1));
        Assert.assertEquals(ALARM_ENTER,
                decoder.decodeAlarm(1 << 2));
    }

    @Test
    public void decodeTest() throws Exception {
        String msg = "[3G*1234567890*008C*UD,110820,141100,A,-29.358390,S,-49.727460,W,0.00,0.00,0.00,10,22,100,100,0]";
        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(null);

        Protocol protocol = mock(Protocol.class);
        when(protocol.getName()).thenReturn("watch");

        DeviceSession deviceSession = mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(1l);

        WatchProtocolDecoder decoder = spy(new WatchProtocolDecoder(protocol));
        when(decoder.getDeviceSession(any(), any(), anyString())).thenReturn(deviceSession);

        Position result = (Position) decoder.decode(channel, null, Unpooled.copiedBuffer(msg.getBytes()));
        Assert.assertEquals(result.getLatitude(), -29.358390, 0.01);
        Assert.assertEquals(result.getLongitude(), -49.727460, 0.01);
        Assert.assertEquals(result.getValid(), true);
    }

    @Test
    public void decodeAlarmLowBatteryTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertEquals(decoder.decodeAlarm(1), Position.ALARM_LOW_BATTERY);
    }

    @Test
    public void decodeAlarmGeofenceExitTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertEquals(decoder.decodeAlarm(2), Position.ALARM_GEOFENCE_EXIT);
    }

    @Test
    public void decodeAlarmGeofenceEnterTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertEquals(decoder.decodeAlarm(4), Position.ALARM_GEOFENCE_ENTER);
    }

}