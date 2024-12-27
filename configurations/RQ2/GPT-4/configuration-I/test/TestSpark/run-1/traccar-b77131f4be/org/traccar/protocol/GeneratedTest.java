package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.any;

public class GeneratedTest {

    @Test
    public void GalileoProtocolDecoderConstructorTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void decodeValidMsgWithoutChannelTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress address = Mockito.mock(SocketAddress.class);
        Object msg = "test message";
        Object result = decoder.decode(null, address, msg);
        assertNotNull(result);
    }

    @Test
    public void decodeValidMsgWithChannelTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);
        Object msg = "test message";
        Object result = decoder.decode(channel, address, msg);
        assertNotNull(result);
    }

    @Test
    public void decodeInvalidMsgTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress address = Mockito.mock(SocketAddress.class);
        decoder.decode(null, address, null);
    }

    @Test
    public void decodeWithNullSocketAddressTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        Object msg = "test message";
        Object result = decoder.decode(channel, null, msg);
        assertNotNull(result);
    }

}