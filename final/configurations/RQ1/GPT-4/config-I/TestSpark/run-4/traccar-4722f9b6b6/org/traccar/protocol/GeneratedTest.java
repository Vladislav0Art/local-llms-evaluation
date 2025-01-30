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

public class GeneratedTest {

    @Test
    public void decodeInvalidContentTest() throws Exception {
        ByteBuf msg = Unpooled.wrappedBuffer("[CS*0123456789*SIM]".getBytes(StandardCharsets.US_ASCII));
        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = Mockito.mock(InetSocketAddress.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Object result = decoder.decode(channel, remoteAddress, msg);
        Assert.assertNull(result);
    }

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

    @Test
    public void decodePositionUDTest() throws Exception {
        ByteBuf msg = Unpooled.wrappedBuffer("[3G*1800000002*00BD*UD,200816,031301,V,19.435169,N,99.155556,W,0.00,0.00,,5,,54,59,1,199,4,1]".getBytes(StandardCharsets.US_ASCII));
        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = Mockito.mock(InetSocketAddress.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Position position = (Position) decoder.decode(channel, remoteAddress, msg);
        Assert.assertNotNull(position);
        Assert.assertEquals(19.435169, position.getLatitude(), 0.000001);
        Assert.assertEquals(-99.155556, position.getLongitude(), 0.000001);
        Assert.assertTrue(position.getValid());
        Assert.assertEquals(new Date(120, 7, 20, 3, 13, 1), position.getDeviceTime());
    }

}