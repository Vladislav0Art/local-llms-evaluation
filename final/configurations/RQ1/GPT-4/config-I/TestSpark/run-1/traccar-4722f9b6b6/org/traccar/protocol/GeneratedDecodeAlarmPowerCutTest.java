package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Device;
import org.traccar.protocol.WatchProtocolDecoder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodeAlarmPowerCutTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void decodeAlarmPowerCutTest() {
        int status = 16384;
        String result = decoder.decodeAlarm(status);
        Assert.assertEquals("Power Cut", result);
    }

}