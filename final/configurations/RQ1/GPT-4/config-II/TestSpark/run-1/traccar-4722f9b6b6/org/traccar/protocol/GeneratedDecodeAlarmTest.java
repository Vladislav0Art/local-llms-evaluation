package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.Protocol;
import org.traccar.Context;
import org.traccar.protocol.ProtocolDecoderTest;
import org.traccar.model.Position;
import org.traccar.helper.TestIdentityManager;
import org.traccar.model.Network;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertNull(decoder.decodeAlarm(10));
        assertEquals(decoder.decodeAlarm(0), Position.ALARM_LOW_BATTERY);
        assertEquals(decoder.decodeAlarm(1), Position.ALARM_GEOFENCE_EXIT);
        assertEquals(decoder.decodeAlarm(21), Position.ALARM_FALL_DOWN);
    }

}