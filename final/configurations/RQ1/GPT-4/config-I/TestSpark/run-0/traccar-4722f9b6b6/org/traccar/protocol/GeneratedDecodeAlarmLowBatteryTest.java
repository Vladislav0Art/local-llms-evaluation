package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedDecodeAlarmLowBatteryTest {

    private static WatchProtocolDecoder decoder;

    @BeforeClass
    public static void setUp() {
        Protocol protocol = Mockito.mock(Protocol.class);
        decoder = new WatchProtocolDecoder(protocol);
    }

    @AfterClass
    public static void tearDown() {
        decoder = null;
    }

    @Test
    public void decodeAlarmLowBatteryTest() {
        int status = 0;
        String expectedAlarm = Position.ALARM_LOW_BATTERY;
        assertEquals(expectedAlarm, decoder.decodeAlarm(status));
    }

}