package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    private Protocol protocol = Mockito.mock(Protocol.class);

    @Test
    public void getHasIndexDefaultTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerDefaultTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNull(decoder.getManufacturer());
    }

    @Test
    public void decodeWithNullChannelTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(null, new InetSocketAddress(80), "Test Message");
        Assert.assertNull(result);
    }

    @Test
    public void decodeWithNullRemoteAddressTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(Mockito.mock(Channel.class), null, "Test Message");
        Assert.assertNull(result);
    }

    @Test
    public void decodeWithNullMsgTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(Mockito.mock(Channel.class), new InetSocketAddress(80), null);
        Assert.assertNull(result);
    }

    @Test
    public void decodeWithByteBufMsgTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf byteBuf = Unpooled.copiedBuffer("Test Message", StandardCharsets.US_ASCII);
        Object result = decoder.decode(Mockito.mock(Channel.class), new InetSocketAddress(80), byteBuf);
        Assert.assertNotNull(result);
    }

}