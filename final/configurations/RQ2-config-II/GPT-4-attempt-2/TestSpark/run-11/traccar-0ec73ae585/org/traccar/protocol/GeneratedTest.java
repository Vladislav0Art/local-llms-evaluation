package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Channel channel;
    @Mock
    Protocol protocol;

    @Test
    public void watchProtocolDecoderConstructorTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean result = decoder.getHasIndex();
        assertFalse(result);
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String result = decoder.getManufacturer();
        assertTrue(result.length() > 0);
    }

    @Test
    public void decodeNoMessageTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = null;
        Object decoded = decoder.decode(channel, new InetSocketAddress(5000), msg);
        assertNull(decoded);
    }

    @Test
    public void decodeWithMessageTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "example";
        Object decoded = decoder.decode(channel, new InetSocketAddress(5000), msg);
        assertTrue(decoded instanceof Position);
    }

}