package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.mockito.Mockito.*;

import java.lang.reflect.Method;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Method decodeAlarm = WatchProtocolDecoder.class.getDeclaredMethod("decodeAlarm", int.class);
        decodeAlarm.setAccessible(true);

        Assert.assertEquals(Position.ALARM_LOW_BATTERY, decodeAlarm.invoke(decoder, 1));
        Assert.assertEquals(Position.ALARM_GEOFENCE_EXIT, decodeAlarm.invoke(decoder, 2));
        Assert.assertEquals(Position.ALARM_GEOFENCE_ENTER, decodeAlarm.invoke(decoder, 4));
        Assert.assertEquals(Position.ALARM_POWER_CUT, decodeAlarm.invoke(decoder, 16384));
        Assert.assertEquals(Position.ALARM_SOS, decodeAlarm.invoke(decoder, 65536));
        Assert.assertEquals(Position.ALARM_LOW_BATTERY, decodeAlarm.invoke(decoder, 131072));
        Assert.assertEquals(Position.ALARM_GEOFENCE_EXIT, decodeAlarm.invoke(decoder, 262144));
        Assert.assertEquals(Position.ALARM_GEOFENCE_ENTER, decodeAlarm.invoke(decoder, 524288));
        Assert.assertEquals(Position.ALARM_REMOVING, decodeAlarm.invoke(decoder, 1048576));
        Assert.assertEquals(Position.ALARM_FALL_DOWN, decodeAlarm.invoke(decoder, 2097152));
        Assert.assertEquals(gr(null, decodeAlarm.invoke(decoder, 0)));
    }

}