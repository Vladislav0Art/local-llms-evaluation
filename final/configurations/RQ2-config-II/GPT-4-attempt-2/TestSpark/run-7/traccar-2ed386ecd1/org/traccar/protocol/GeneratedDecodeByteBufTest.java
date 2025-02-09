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

public class GeneratedDecodeByteBufTest {

    @Test
    public void decodeByteBufTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        ByteBuf msg = Unpooled.copiedBuffer("0.00", StandardCharsets.UTF_8);
        Object result = gt06ProtocolDecoder.decode(channel, null, msg);
        Assert.assertNull(result);
    }

}