package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneratedDecodeAlarmLowBatteryStatusCheckTest {

    @Test
    public void decodeAlarmLowBatteryStatusCheckTest() {
        WatchProtocolDecoder wDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        String expected = Position.ALARM_LOW_BATTERY;
        String actual = wDecoder.decodeAlarm(0);
        Assert.assertEquals(expected, actual);
    }
}

}