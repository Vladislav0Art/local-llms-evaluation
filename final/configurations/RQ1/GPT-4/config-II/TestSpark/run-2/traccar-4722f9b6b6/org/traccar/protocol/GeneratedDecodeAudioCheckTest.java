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

public class GeneratedDecodeAudioCheckTest {

    @Test
    public void decodeAudioCheckTest() {
        WatchProtocolDecoder wDecoder = new WatchProtocolDecoder(new Protocol("watch"));

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        ByteBuf buf = Unpooled.copiedBuffer("[OY*071610117773*0005*JXTK10,1,1,1,MZIuM]", StandardCharsets.US_ASCII);
        Position p = (Position) wDecoder.decode(channel, remoteAddress, buf);

        Assert.assertNotNull(p);
        Assert.assertEquals(1L, p.getDeviceId());
        Assert.assertEquals("MZIuM", p.get(Position.KEY_AUDIO));
    }

}