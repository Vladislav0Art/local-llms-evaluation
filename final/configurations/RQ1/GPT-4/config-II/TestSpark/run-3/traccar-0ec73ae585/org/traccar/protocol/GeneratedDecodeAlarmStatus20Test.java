package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

public class GeneratedDecodeAlarmStatus20Test {

    @Test
    public void decodeAlarmStatus20Test() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        int status = 20;
        Assert.assertEquals(Position.ALARM_REMOVING, decoder.decodeAlarm(status));
    }

}