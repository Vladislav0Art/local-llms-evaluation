package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

public class GeneratedDecodeAlarmStatus21Test {

    @Test
    public void decodeAlarmStatus21Test() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        int status = 21;
        Assert.assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(status));
    }

}