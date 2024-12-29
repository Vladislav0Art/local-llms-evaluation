package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsPosWithAllParamsTest {

    @Test
    public void decodeGpsPosWithAllParamsTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("DEADBEEF", StandardCharsets.UTF_8);

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true,
                true, true, TimeZone.getDefault());

        Assert.assertTrue(result);
    }

}