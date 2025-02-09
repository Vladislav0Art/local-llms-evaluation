package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

        assertNotNull(watchProtocolDecoder);
    }

    @Test
    public void getHasIndexTest() {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

        assertFalse(watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

        assertNull(watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void decodeNullTest() throws Exception {
        Protocol protocol = new Protocol("testProtocol");
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = null;
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

        assertNull(watchProtocolDecoder.decode(channel, remoteAddress, msg));
    }

    @Test
    public void decodeNonNullTest() throws Exception {
        Protocol protocol = new Protocol("testProtocol");
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "Test message";
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);

        assertNull(watchProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}