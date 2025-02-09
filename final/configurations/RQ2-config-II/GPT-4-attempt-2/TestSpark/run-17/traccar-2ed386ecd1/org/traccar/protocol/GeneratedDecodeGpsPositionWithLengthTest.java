package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedDecodeGpsPositionWithLengthTest {

    @Test
    public void decodeGpsPositionWithLengthTest() {
        ByteBuf buf = Unpooled.copiedBuffer("[1,2,3,4,5,6]", StandardCharsets.UTF_8);
        Position position = new Position();
        TimeZone timeZone = TimeZone.getTimeZone("GMT");

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, timeZone);

        Assert.assertTrue(result);
    }

}