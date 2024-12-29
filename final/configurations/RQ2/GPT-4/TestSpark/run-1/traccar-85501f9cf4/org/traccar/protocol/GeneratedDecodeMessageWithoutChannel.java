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
public class GeneratedDecodeMessageWithoutChannel {

    @Test
    public void decodeMessageWithoutChannel() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        ByteBuf msg = Unpooled.copiedBuffer("DEADBEEF", StandardCharsets.UTF_8);

        Object result = decoder.decode(null, Mockito.mock(SocketAddress.class), msg);

        Assert.assertNotNull(result);
    }

}