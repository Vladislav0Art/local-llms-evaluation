package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeGpsTestNotNullBuf {

    @Test
    public void decodeGpsTestNotNullBuf() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("test", StandardCharsets.UTF_8);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault());

        Assert.assertEquals(true, result);
    }

}