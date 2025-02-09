package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void constructorWithProtocolTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        assertNotNull(watchProtocolDecoder);
    }

    @Test
    public void getHasIndexDefaultTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        assertFalse(watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerDefaultTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        assertNull(watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void decodeWithEmptyMessageTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        Object result = watchProtocolDecoder.decode(channel, remoteAddress, "");
        assertNull(result);
    }

    @Test
    public void decodeWithNullMessageTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        Object result = watchProtocolDecoder.decode(channel, remoteAddress, null);
        assertNull(result);
    }

    @Test
    public void decodeWithInvalidMessageTest() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        watchProtocolDecoder.decode(channel, remoteAddress, new Object());
    }

}