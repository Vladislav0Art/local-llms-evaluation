package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.BaseProtocol;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void decodeNullChannelTest() throws Exception {
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.copiedBuffer("1234567890", StandardCharsets.US_ASCII);
        Object result = decoder.decode(null, new InetSocketAddress("localhost", 8080), buf);

        Assert.assertNotNull(result);
    }

    @Test
    public void decodeNullAddressTest() throws Exception {
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.copiedBuffer("1234567890", StandardCharsets.US_ASCII);
        Channel channel = Mockito.mock(Channel.class);
        Object result = decoder.decode(channel, null, buf);

        Assert.assertNotNull(result);
    }

    @Test
    public void decodeNullMsgTest() throws Exception {
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        Object result = decoder.decode(channel, new InetSocketAddress("localhost", 8080), null);

        Assert.assertNull(result);
    }

    @Test
    public void getHasIndexTest() {
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        boolean result = decoder.getHasIndex();

        Assert.assertTrue(result);
    }

    @Test
    public void getManufacturerTest() {
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        String result = decoder.getManufacturer();

        Assert.assertNotNull(result);
    }

}