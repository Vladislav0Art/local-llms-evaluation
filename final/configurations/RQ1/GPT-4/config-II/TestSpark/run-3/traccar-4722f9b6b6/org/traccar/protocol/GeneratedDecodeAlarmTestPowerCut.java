package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.net.SocketAddress;

@RunWith(JUnit4.class)
public class GeneratedDecodeAlarmTestPowerCut {


    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeAlarmTestPowerCut() {
        Protocol protocol = new Protocol("watch");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String alarm = decoder.decodeAlarm(16384);
        assertEquals(Position.ALARM_POWER_CUT, alarm);
    }

}