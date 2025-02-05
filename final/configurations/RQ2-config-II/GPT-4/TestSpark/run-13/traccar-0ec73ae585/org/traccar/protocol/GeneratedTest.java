package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void getHasIndexTest() {
        assertEquals(false, decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        assertEquals("Unknown", decoder.getManufacturer());
    }

    @Test
    public void decodeValidMessageTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("10.0.0.2", 8080);
        Object msg = Unpooled.copiedBuffer("message".getBytes());

        Object result = decoder.decode(channel, remoteAddress, msg);
        assertEquals("ExpectedResult", result.toString());
    }

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new InetSocketAddress("10.0.0.3", 8080);
        Object msg = Unpooled.copiedBuffer("invalid_message".getBytes());

        decoder.decode(channel, remoteAddress, msg);
    }

}