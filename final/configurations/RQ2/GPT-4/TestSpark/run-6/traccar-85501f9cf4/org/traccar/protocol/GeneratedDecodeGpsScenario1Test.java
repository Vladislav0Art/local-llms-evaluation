package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeGpsScenario1Test {

    @Test
    public void decodeGpsScenario1Test() {
        ByteBuf buf = Unpooled.copiedBuffer("Hello".getBytes(StandardCharsets.UTF_8));
        Position position = new Position();
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

}