package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

public class GeneratedDecodeAlarmStatus14Test {

    @Test
    public void decodeAlarmStatus14Test() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        int status = 14;
        Assert.assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(status));
    }

}