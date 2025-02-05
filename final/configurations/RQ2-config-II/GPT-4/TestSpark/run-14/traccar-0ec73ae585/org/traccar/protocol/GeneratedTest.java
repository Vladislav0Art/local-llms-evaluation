package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.model.ProtocolTracker;

import java.net.InetSocketAddress;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void getHasIndexDefaultTest() {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals(false, decoder.getHasIndex());
    }

    @Test
    public void getManufacturerDefaultTest() {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals(null, decoder.getManufacturer());
    }

    @Test
    public void decodeWithValidMessageTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 5000);
        Object msg = Unpooled.copiedBuffer("1234567890".getBytes());

        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Object result = decoder.decode(channel, remoteAddress, msg);

        assertNotNull(result);
        assertEquals(Position.class, result.getClass());
    }

    @Test
    public void decodeWithInvalidMessageTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 5000);
        Object msg = null;

        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        decoder.decode(channel, remoteAddress, msg);
    }

}