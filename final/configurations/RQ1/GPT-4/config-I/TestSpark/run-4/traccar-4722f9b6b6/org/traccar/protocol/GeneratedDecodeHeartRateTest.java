package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedDecodeHeartRateTest {

    @Test
    public void decodeHeartRateTest() throws Exception {
        ByteBuf msg = Unpooled.wrappedBuffer("[CS*0123456789*UD,120918,130330,0,-,-,0.00,-,-,Rvreaux,nchnyovfakdr,r34e0vf1b9u5,,0,0,85]".getBytes(StandardCharsets.US_ASCII));
        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = Mockito.mock(InetSocketAddress.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Position position = (Position) decoder.decode(channel, remoteAddress, msg);
        Assert.assertNotNull(position);
        Assert.assertEquals(85, (int) position.getInteger(Position.KEY_HEART_RATE));
    }

}