package org.traccar.protocol;

import org.junit.Test;
import org.traccar.session.DeviceSession;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeAlarmTest {

    private final Protocol protocol = new Protocol("watch");
    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    @Test
    public void decodeAlarmTest() {
        int status = 0;
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(status));
        status = 19;
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(status));
        status = 20;
        assertEquals(Position.ALARM_REMOVING, decoder.decodeAlarm(status));
    }

}