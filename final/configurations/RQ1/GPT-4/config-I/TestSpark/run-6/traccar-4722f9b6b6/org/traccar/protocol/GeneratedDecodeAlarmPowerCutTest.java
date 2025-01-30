package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeAlarmPowerCutTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decodeAlarmPowerCutTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String alarm = decoder.decodeAlarm(14);
        assertEquals(Position.ALARM_POWER_CUT, alarm);
    }

}