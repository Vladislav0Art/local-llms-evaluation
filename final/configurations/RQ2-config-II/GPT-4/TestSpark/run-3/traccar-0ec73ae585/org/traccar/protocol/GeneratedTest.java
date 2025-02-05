package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

public class GeneratedTest {

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test"));
        assertNotNull(decoder);
    }

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test"));
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test"));
        assertNull(decoder.getManufacturer());
    }

    @Test
    public void decodeEmptyTest() throws Exception {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress address = new InetSocketAddress("localhost", 8080);
        Object result = decoder.decode(channel, address, Unpooled.EMPTY_BUFFER);
        assertNull(result);
    }

}