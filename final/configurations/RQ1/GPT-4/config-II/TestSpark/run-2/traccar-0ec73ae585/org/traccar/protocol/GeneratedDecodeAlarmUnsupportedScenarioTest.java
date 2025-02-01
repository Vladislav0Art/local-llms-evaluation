package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;

public class GeneratedDecodeAlarmUnsupportedScenarioTest {

    @Test
    public void decodeAlarmUnsupportedScenarioTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        String alarm = decoder.decodeAlarm(28);
        assertEquals(alarm, null);
    }

}