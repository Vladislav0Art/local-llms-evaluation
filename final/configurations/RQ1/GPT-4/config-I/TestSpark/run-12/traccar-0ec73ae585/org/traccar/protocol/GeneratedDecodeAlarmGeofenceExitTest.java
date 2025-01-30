package org.traccar.protocol;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.helper.Parser;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeAlarmGeofenceExitTest {

    @Test
    public void decodeAlarmGeofenceExitTest() {
        int status = 2;
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol(""));
        String actualAlarm = decoder.decodeAlarm(status);
        String expectedAlarm = Position.ALARM_GEOFENCE_EXIT;
        assertEquals(expectedAlarm, actualAlarm);
    }

}