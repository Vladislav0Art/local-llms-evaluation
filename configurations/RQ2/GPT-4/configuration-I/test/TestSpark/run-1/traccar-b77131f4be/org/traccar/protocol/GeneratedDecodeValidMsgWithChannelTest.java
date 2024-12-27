package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.any;

public class GeneratedDecodeValidMsgWithChannelTest {

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

}