package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedDecodeAlarmAtStatusZeroTest {

    @Test
    public void DecodeAlarmAtStatusZeroTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        String result = decoder.decodeAlarm(0);
        assertEquals(Position.ALARM_LOW_BATTERY, result);
    }

}