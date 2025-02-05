package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void getHasIndexTest() {
        Assert.assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        assertEquals("", decoder.getManufacturer());
    }

    @Test
    public void decodeValidWithChannelTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        byte[] bytes = {10, 20, 30, 40, 50};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8000);

        Object obj = decoder.decode(channel, remoteAddress, buf);

        assertNotNull(obj);
    }

    @Test
    public void decodeValidWithNoChannelTest() throws Exception {
        byte[] bytes = {10, 20, 30, 40, 50};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8000);

        Object obj = decoder.decode(null, remoteAddress, buf);

        assertNotNull(obj);
    }

    @Test
    public void decodeThrowExceptionWithInvalidBytesTest() throws Exception {
        byte[] bytes = {100, 200, 300, 400, 500};
        ByteBuf buf = Unpooled.copiedBuffer(bytes);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 8000);

        decoder.decode(null, remoteAddress, buf);
    }

}