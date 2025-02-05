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
import java.util.TimeZone;

public class GeneratedDecodeGpsWithLengthTest {

    @Test
    public void decodeGpsWithLengthTest() {
        ByteBuf buf = Unpooled.copiedBuffer("12".getBytes(StandardCharsets.UTF_8));
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        Position position = new Position();

        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, timezone));
    }

}