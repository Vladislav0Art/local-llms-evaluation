package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeGpsWithoutSatellitesAndHasSpeedTest {

    @Test
    public void decodeGpsWithoutSatellitesAndHasSpeedTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0.00", StandardCharsets.UTF_8);
        TimeZone timeZone = TimeZone.getDefault();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, false, true, timeZone);
        Assert.assertTrue(result);
    }

}