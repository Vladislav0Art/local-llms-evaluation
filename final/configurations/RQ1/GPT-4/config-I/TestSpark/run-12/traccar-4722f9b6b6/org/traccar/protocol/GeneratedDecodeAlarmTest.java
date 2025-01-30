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

public class GeneratedDecodeAlarmTest {

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

}